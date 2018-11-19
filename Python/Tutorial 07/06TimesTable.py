def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()


number_to_times = int(input("Please give me a number from 1 - 10, I will give you its times table up to 12: "))

#   To make sure we get the times table up to the 12 number, we need to loop it 13 times,
#   As it will start at 0.
to_twelve = 13

times_table = []
for counter in range(to_twelve):
    times_table.append(number_to_times * counter)

times_table.sort()

print("The " + str(number_to_times) + " times table: ")

print_list(times_table)

print()
input("Press return to continue ...")
