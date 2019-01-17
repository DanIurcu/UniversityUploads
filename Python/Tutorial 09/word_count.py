import os


def search(curr_path):
    filenames = os.listdir(curr_path)

    for filename in filenames:
        if filename.endswith(".txt"):
            count(filename)


def count(filename):
    open_file = open(filename, 'r')
    file = open_file.read()
    words = file.split(" ")
    print(filename + ": " + str(len(words)))
    open_file.close()


curr_path = os.getcwd()

search(curr_path)


