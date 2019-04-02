#!/bin/sh

# -----------------------------------------------------------------------------
# Description:
# -----------------------------------------------------------------------------
# Axon.ivy Engine systemd service installer
#
# Copyright 1994 - 2017 AXON IVY AG
# -----------------------------------------------------------------------------

USER=`whoami`
if [ "$USER" != "root" ]
then
	echo "You must be root to execute this script!"
	exit 0
fi

GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m'

cd ..
INSTALLDIR=`pwd`
cd bin

echo ""
printf "Welcome to the ${GREEN}Axon.ivy${NC} Engine systemd service installer!\n"
echo ""


echo "---"
echo "Please set your Axon.ivy Engine installation directory"
read -p "Select directory: [$INSTALLDIR"] SELECTEDDIR
if [ -z $SELECTEDDIR ]
then
	echo ""
else
	INSTALLDIR=$SELECTEDDIR
	echo ""
fi


echo "---"
REAL_USER=`ls -ld $INSTALLDIR | awk '{print $3}'`
echo "Please enter the user under which the Axon.ivy Engine Service should run (must NOT be root)"
read -p "Select user: [$REAL_USER"] SELECTEDUSER
if [ -z $SELECTEDUSER ]
then
	echo ""
else
	REAL_USER=$SELECTEDUSER
	echo ""
fi

echo "---"
REAL_GROUP=`ls -ld $INSTALLDIR | awk '{print $4}'`
echo "Please enter the group under which the Axon.ivy Engine Service should run"
read -p "Select group: [$REAL_GROUP"] SELECTEDGROUP
if [ -z $SELECTEDGROUP ]
then
	echo ""
else
	REAL_GROUP=$SELECTEDGROUP
	echo ""
fi

echo "Installing Axon.ivy Engine Service..."
echo ""
echo "- Configuring path and user/group of start script"

sed "s|/<installationdir>|$INSTALLDIR|g" AxonIvyEngine.service > AxonIvyEngineConfigured1.service
sed "s|<user>|$REAL_USER|g" AxonIvyEngineConfigured1.service > AxonIvyEngineConfigured2.service
sed "s|<group>|$REAL_GROUP|g" AxonIvyEngineConfigured2.service > AxonIvyEngineConfigured3.service
printf "...${GREEN}done${NC}\n"

echo "- Copying start script to '/etc/systemd/system'"

if [ -d "/etc/systemd/system" ]
then
	cp AxonIvyEngineConfigured3.service /etc/systemd/system/AxonIvyEngine.service
	printf "...${GREEN}done${NC}\n"
	echo "- Cleaning up"
	rm AxonIvyEngineConfigured1.service
	rm AxonIvyEngineConfigured2.service
	rm AxonIvyEngineConfigured3.service
	printf "...${GREEN}done${NC}\n"
	echo "- Reloading daemons"
	systemctl daemon-reload
	printf "...${GREEN}done${NC}\n"
	echo ""
	echo "AxonIvyEngine.service was successfully installed"
	printf "You can start it by executing '${GREEN}systemctl start AxonIvyEngine.service${NC}' in your console\n"
	echo "For starting up during boot, most distributions have a specific command to configure services"
	echo "e.g. 'systemctl enable AxonIvyEngine.service'"
    echo "You should find the proper command in the documentation of your Linux distribution"

else
	printf "The directory '/etc/systemd/system' does not exist, ${RED}canceling${NC} installation. Does your Linux distribution support systemd?\n"
	exit 1
fi

echo ""

exit 0
