#!/bin/sh

# -----------------------------------------------------------------------------
# Description:
# -----------------------------------------------------------------------------
# Launches an Axon.ivy java class with the VM option "-server"
#
# The script must be located in the bin directory of the Axon.ivy installation
# directory.
#
# Copyright 1994 - 2018 AXON IVY AG
# -----------------------------------------------------------------------------

# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '.*/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

# Get standard environment variables
PRGDIR=`dirname "$PRG"`

# change to parent dir
cd "$PRGDIR/.."

# set current directory as AxonIvyHome
AxonIvyHome=`pwd`

# Build classpath
# add all jars in lib/boot to classpath
for jar in "$AxonIvyHome/system/lib/boot/"*.jar;
do
  CLASSPATH="$CLASSPATH":"$jar"
done

# Set standard commands for invoking Java.
if [ -x "$AxonIvyHome/jre/bin/java" ]; then
    JAVA="$AxonIvyHome/jre/bin/java"
elif [ -x "$IVY_JAVA_HOME/bin/java" ]; then
    JAVA="$IVY_JAVA_HOME/bin/java"
elif [ -x "$JAVA_HOME/bin/java" ]; then
    JAVA="$JAVA_HOME/bin/java"
else
    JAVA=`which java`
fi

# Check Java binary exists
if [ ! -x "$JAVA" ]; then
    echo "Could not find any executable java binary. Please install java in your PATH or set JAVA_HOME"
    exit 1
fi

# Check JVM Version
VERSION=$(${JAVA} -version 2>&1 | egrep '"([0-9].[0-9]\..*[0-9]).*"' | awk '{print substr($3,2,length($3)-2)}' | awk '{print substr($1, 3, 3)}' | sed -e 's;\.;;g')
if [ "${VERSION}" -lt "80" ]; then
    echo "JVM must be 1.8 or greater ($JAVA)"
    exit 1;
fi

# Check is Oracle JVM
if ${JAVA} -version 2>&1 | grep "^IBM" ; then
    echo "Only Oracle JVM is supported"
    exit 1;
fi

# Check sudo
if [ "$USER" = "root" ]; then
     echo "Cannot start the engine with user 'root'. Please run it with a normal user such as 'ivy'."
     exit 1;
fi

# Set locale to de_DE@euro so that java file.encoding is set to ISO-8856-15. 
# Uncomment this line if file encoding is wrong when starting Axon.ivy Engine 
# in a runlevel.
#
# export LC_CTYPE=de_DE@euro

# starting java class 
#
# For best performance adjust the parameters -Xms and -Xmx
# Set -Xms and -Xmx equal, e.g. -Xms300m -Xmx300m, if you can afford to grant more memory at any time to this process
# Use larger values for -Xms and -Xmx for systems with very much load
# Use the logviewer application (memory chart) to see how much memory is actually used and assigned to do the fine tuning
# See http://java.sun.com/docs/hotspot/gc1.4.2/ for more details and more options

if [ "x$1" = 'xstartdaemon' ] || [ "x$1" = 'x-startdaemon' ]; then
     nohup "$JAVA" -server -cp "$CLASSPATH" -Dosgi.install.area="$AxonIvyHome/system" -Dosgi.instance.area="$AxonIvyHome/work" $JAVA_OPTS org.eclipse.equinox.launcher.Main $@ & echo $! > bin/AxonIvyEngine.pid
else
     exec "$JAVA" -server -cp "$CLASSPATH" -Dosgi.install.area="$AxonIvyHome/system" -Dosgi.instance.area="$AxonIvyHome/work" $JAVA_OPTS org.eclipse.equinox.launcher.Main $@
fi
