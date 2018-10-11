#!/bin/bash

echo "Please insert values"

counter=0
num_array=()
total=0
loop_boolean="true"
yes="yes"

while [ "$loop_boolean" == "true" ]
do
        read user_input
        num_array=("${num_array[@]}" $user_input)
        echo "Are you finished?"
        read finished

	if [ "$finished" == "$yes" ]
                then loop_boolean="false"

                for x in ${num_array[@]}
                        do
                        let total+=${x}
                done
                let counter++
	else
		let counter++
     	fi
done

echo "The average is $((total / counter))"
echo "You have inputted ${counter} number(s)"

