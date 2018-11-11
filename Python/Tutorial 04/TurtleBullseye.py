from turtle import *

def circle_at(r, colour, x, y):

    fillcolor(colour)
    begin_fill()
    pendown()
    circle(r)
    left(90)
    end_fill()
    penup()
    forward(r // 3)
    right(90)


x = 0
y = 0
r_str = input("What size would you like the first circle to be?")
r_int = int(r_str)
colors = {'color1' : "", 'color2' : "black", 'color3' : "blue", 'color4' : "red", 'color5' : "yellow"}

for i, o in colors.items() :
    circle_at(r_int, o, x, y)
    r_int = r_int // 1.5
    print(r_int)

exitonclick()
