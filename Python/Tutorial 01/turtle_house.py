from turtle import *

#Square
#Sets the colour of the box
color("black","yellow")

begin_fill() #Begins the fill
forward(100)
left(90)
forward(100)
left(90)
forward(100)
left(90)
forward(100)
end_fill()#Ends the fll

up() #Pen up

#New Position
left(90)
forward(100)
left(90)
forward(100)

#Roof
color("black", "red") #Colour of roof

down() #Pen Down


begin_fill() #begin fill
left(35)
forward(70)
left(100)
forward(80)
left(135)
forward(110)
end_fill()#end fill



exitonclick()
