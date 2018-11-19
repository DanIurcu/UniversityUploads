def first(fruits):
    print(fruits[0])


def last(fruits):
    length_of_list = len(fruits)
    print(fruits[length_of_list - 1])


fruits = ["Banana","Orange","Apple","Mango"]

fruits.sort()

print("The first fruit in the sorted list: ")
first(fruits)

print("The last fruit in the sorted list: ")
last(fruits)

fruits.reverse()

print("The first fruit in the reversed list: ")
first(fruits)

print("The last fruit in the reversed list: ")
last(fruits)

fruits.clear()

print()
input("Press return to continue ...")
