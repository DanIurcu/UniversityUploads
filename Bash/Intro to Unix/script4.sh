#!/bin/bash

existing_files=()
echo "File name:"
read file_name

for i in *;; do
	existing_files=("${i}" "${existing_files[@]}")
done

for x in "${existing_files[@]}"; do
	if [ $file_name == "$x" ]
		then cat $file_name | less
		nano $file_name
		cat $file_name | less
	else
		echo "The file does not exist"
	fi
done
