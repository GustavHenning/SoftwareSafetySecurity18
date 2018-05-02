#!/bin/bash

# example: bash run.sh DiningPhil

TO_RUN=$1

if [ ! -d ../jpf-core/src/examples ]; then
	echo "is your jpf-core in the root directory of this project?"
	exit 1
fi

rm -rf ../jpf-core/src/examples/*

cp -R ./src/. ../jpf-core/src/examples/

../jpf-core/bin/jpf ../jpf-core/src/examples/$TO_RUN.jpf
