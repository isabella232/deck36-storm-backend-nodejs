#!/bin/sh

MYHOME=`echo ~`
sed -e 's#/home/vagrant/.m2#'$MYHOME'/vagrant-plan9/source/m2#g' < deck36-storm-backend-nodejs.iml > deck36-storm-backend-nodejs.iml.patch
mv deck36-storm-backend-nodejs.iml.patch deck36-storm-backend-nodejs.iml

