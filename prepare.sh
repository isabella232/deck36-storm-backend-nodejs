#!/bin/sh
sudo cp ./lein /usr/local/bin
sudo chmod 775 /usr/local/bin/lein

ln -s ../../deck36-api-backend/config/ resources/config
ln -s ../../../deck36-api-backend/target resources/nodejs/resources

DIR=`pwd`

lein git-deps

cd $DIR/.lein-git-deps/storm-json	
mvn install

cd $DIR/.lein-git-deps/storm-rabbitmq
mvn install

lein deps
lein idea

cd $DIR

