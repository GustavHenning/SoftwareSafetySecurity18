#!/bin/bash

# Example use: bash testProgram.sh src-jif/exercise/Ex1.jif

JIF_PATH=./lib/jif-3.5.0
JIF_FILE_ARG=$1

if [[ ! -d $JIF_PATH ]]; then
	echo "Cannot find JIF_PATH, check the script and try again."
	exit 1
fi

if [[ ! $JIF_FILE_ARG ]]; then
	echo "Supply the path to the jif file you want to run relative to the top level directory..."
	exit 1
fi

$JIF_PATH/bin/jifc -c -nonrobust -d /tmp -classpath ./bin -sourcepath src-jif -explain $JIF_FILE_ARG

if [[ $? -eq 0 ]]; then
	FILENAME=$(basename $JIF_FILE_ARG .jif)
	RESULT_FILE=/tmp/$FILENAME.java
	if [[ -f $RESULT_FILE ]]; then
		cat $RESULT_FILE
	else
		echo "Success! No errors."
	fi
fi
