from turtle import *

#Box function
def square():
    for x in range(4):
        forward(100)
        left(90) 
#box_one
square()

up() #Brings the pen up so it wont mark the page as I reposition it.

#New position
goto(150,0)

down() #Brings the pen back down so we can make a new box

#Box two
square()

exitonclick()
