from random import randint

name = input("Please input your name: ")

rand_number = randint(1,10)

message = "Hello " + name + " your lucky number is " + str(rand_number)

if rand_number == 3 or rand_number == 9:
    print(message + " and you have won a prize")
elif rand_number == 7:
    print(message + " and you have hit the jackpot")
else:    
    print(message)
