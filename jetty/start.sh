#!/bin/sh

export JETTY_HOME=/usr/local/jetty

cd /jetty-base
java -jar $JETTY_HOME/start.jar

