def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()

fruit = []

while True:
    prompt = input("Please enter a name of a fruit: ")

    if prompt in fruit:
        break
    elif not prompt:
        break

    fruit.append(prompt)

print_list(fruit)
print("Your score is " + str(len(fruit)))
