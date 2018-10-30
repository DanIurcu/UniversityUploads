from random import randint

def random(minimum=1, maximum= 100):
    random_num = randint(minimum, maximum)
    return random_num


min_str = input("Min: ")
max_str = input("Max: ")

if not min_str or not max_str:
    max_str = str(100)
    min_str = str(1)

elif not max_str:
    max_str = str(100)



minimum = int(min_str)
maximum = int(max_str)

if maximum > minimum:
    random1 = random(minimum, maximum)
    random2 = random(minimum, maximum)
    random3 = random(minimum, maximum)
    random4 = random(minimum, maximum)
    print(str(random1) + " " + str(random2) + " " + str(random3) + " " + str(random4))
else:
    print(str(maximum) + " is less than " + str(minimum))

input("Press return to continue ...")
