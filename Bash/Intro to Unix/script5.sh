#!/bin/bash

loop_boolean="true"

echo "Which would you like to do?"
echo "1)Write a poem"
echo "2)Run a word count on a poem"
echo "3)Read a poem"
echo "4)Sort"
echo "5)Exit"

while [ "$loop_boolean" == "true" ]
do

	read user_input
	case $user_input in

		1) echo "Whats the name of the poem?"
		   read file_name
		   nano $file_name;;
		2) echo "Which file do you want to count?"
		   read file_name
	  	   wc -w $file_name;;
		3) echo "which would you rather, more or less?"
		   read more_or_less
		   if [ $more_or_less == "more" ]
			then echo "What file do you want to display?"
			read file_name
			cat $file_name | more

		   elif [ $more_or_less == "less" ]
			then echo "What file do you want to display?"
			read file_name
			cat $file_name | less
		   fi ;;
		4) echo "Please name a file to sort"
		   read file_name
		   echo "To what file do you want to output to?"
		   read output_file
		   sort -o $output_file $file_name
		   echo "Would you like to use cat or more"
		   read command
		   if [ $command == "cat" ]
			then cat $output_file
		  elif [ $command == "more" ]
			then more $output_file
		  fi;;
		5) exit 1 ;;
		*) echo "illegal choice please try again"
		   echo "Which would you like to do?"
        	   echo "1)Write a poem"
        	   echo "2)Run a word count on a poem"
        	   echo "3)Display an output"
        	   echo "4)Sort"
        	   echo "5)Exit"
		;;
	esac
done
