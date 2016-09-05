from Tkinter import *

class House:
    def __init__(self, parent):
        self.canvas = Canvas(parent, width = 400, height=400












def draw_house(x, y, colour):


    
    houseCanvas.create_rectangle(x, y, x + 100, y + 100, fill = colour) #the house
    houseCanvas.create_rectangle(x + 40, y + 100, x + 60, y + 70) #the door
    houseCanvas.create_rectangle(x + 10, y + 20, x + 30, y + 50) #left window
    houseCanvas.create_rectangle(x + 70, y + 20, x + 90, y + 50) #right window
    houseCanvas.create_line(x, y, x + 50, y - 70, x + 100, y) #the roof

 

root = Tk()
houseCanvas = Canvas(root, width=400, height=400)
houseCanvas.grid(row=0, column=0)

draw_house(10, 30, "blue")
draw_house(150, 150, "pink")
draw_house(300, 300, "red")
draw_house(10, 300, "yellow")
draw_house(150, 300, "brown")
draw_house(300, 30, "purple")
root.mainloop()
