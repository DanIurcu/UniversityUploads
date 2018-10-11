#!/bin/bash

echo "Please insert three values: "

read val1
read val2
read val3

let total=$val1+$val2+$val3
let average=$total/3

echo "The average is " $average

