#!/bin/bash

echo "Please enter a number:"

read user_input

if [ $user_input == 1 ]
	then echo "The value was 1"
else
	echo "The value was not 1"
fi
