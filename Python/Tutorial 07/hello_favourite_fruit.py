from random import randint

random_num = randint(0, 6)
fruits = ["Banana", "Mango", "Apple", "Orange", "Kiwi", "Avocado", "Dragon Fruit"]

name = input("Hello, what is your name? ")

print("Hello, " + name + " your favourite fruit is " + fruits[random_num])
