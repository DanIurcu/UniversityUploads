import os


def check_log(log_name, file_path):

    if os.path.isfile(file_path):
        open_file = open(log_name, 'a')
        file = open_file
        return file

    else:
        open_file = open(log_name, 'w+')
        file = open_file
        return file


def line_count(file_path):
    count = len(open(file_path).readlines())
    print("The number of lines in the log file is: " + str(count))


log_name = 'log_file.txt'
file_path = './' + log_name
file = check_log(log_name, file_path)

while True:
    new_log = input("Please enter a string you would like to add to the log file: ")
    file.write(new_log +"\n")

    if new_log == "":
        file.close()
        break

line_count(file_path)
