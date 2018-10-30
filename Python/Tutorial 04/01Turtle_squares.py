# draw two squares, side by side, not touching

from turtle import *

def draw_square(length):
    forward(length)
    left(90)
    forward(length)
    left(90)
    forward(length)
    left(90)
    forward(length)
    left(90)

    penup()
    forward(150)
    pendown()


for x in range(1, 5):
    length = input("What length would you like the sides of square " + str(x) + " to be?")
    draw_square(int(length))

exitonclick()

print()
input("Press return to continue ...")
