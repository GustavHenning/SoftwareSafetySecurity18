#!/bin/bash

# build the file
make -f Makefile.unix 
# try to run it with valgrind
valgrind --leak-check=full --track-origins=yes ./psselect -o md71_0.ps 

