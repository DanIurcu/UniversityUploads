from random import randint

name = input("Please input your name: ")
dob = input("And your date of birth: ")
rand_max = int(dob) + 70

rand_num = randint(int(dob),rand_max)

print("Hello " + name + " your lucky year is " + str(rand_num))
