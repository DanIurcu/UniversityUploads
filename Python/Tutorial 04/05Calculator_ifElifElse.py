def input_and_convert(prompt, conversion_fn):
    string = input(prompt)
    number = conversion_fn(string)
    return number

def output(parameter_1, parameter_2):
    parameter1_str = str(parameter_1)
    parameter2_str = str(parameter_2)
    print(parameter1_str + parameter2_str)

def calculate(number_1, number_2, operation):
    if operation == "+":
        combination = number_1 + number_2
    elif operation == "-":
        combination = number_1 - number_2
    elif operation == "*":
        combination = number_1 * number_2
    elif operation == "/":
        if number_2 == 0:
             combination = "You can't divide by zero"
        else:
            combination = number_1 / number_2
    else:
        combination = "ERROR ... '" + operation + "' unrecognised"
    return combination

number_1 = input_and_convert(" First number: ", int)

number_2 = input_and_convert("Second number: ", int)

operation = input_and_convert("Operation [+, -, *, /]: ", str)

combination = calculate(number_1, number_2, operation)
output ("Answer: ", combination)

print()
input("Press return to continue ...")
