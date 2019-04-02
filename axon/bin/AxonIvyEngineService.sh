#!/bin/sh

# -----------------------------------------------------------------------------
# Description:
# -----------------------------------------------------------------------------
# Starts the Axon.ivy Engine
#
# Copyright 1994 - 2017 AXON IVY AG
# -----------------------------------------------------------------------------

# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ] ; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '.*/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

PRGDIR=`dirname "$PRG"`

EXECUTABLE=AxonIvyEngine

if [ "x$1" = 'xstop' ] || [ "x$1" = 'x-stop' ]; then
  exec "$PRGDIR"/"$EXECUTABLE" stopdaemon
else
  exec "$PRGDIR"/"$EXECUTABLE" $@
fi
