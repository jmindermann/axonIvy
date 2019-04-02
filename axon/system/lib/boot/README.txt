This directory is the standard Java classpath directory.

Any jar in this folder will be part of the main classloader.

However, in OSGi, classes defined in these jars won't be available to other
bundles unless org.osgi.framework.bootdelegation property in the 
configuration/config.ini file is modified to delegate the packages.

Please refer to the OSGi Core Specification for more information on these
properties and the OSGi classloading mechanism.