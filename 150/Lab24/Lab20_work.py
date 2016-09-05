from Tkinter import *

root = Tk()
houseCanvas = Canvas(root, width=400, height=400)
houseCanvas.grid(row=0, column=0)

houseCanvas.create_rectangle(20, 380, 120, 280) #the house
houseCanvas.create_rectangle(55, 380, 85, 330) #the door
houseCanvas.create_rectangle(40, 320, 60, 300) #left window
houseCanvas.create_rectangle(80,320, 100, 300) #right window
houseCanvas.create_line(20, 280, 70, 240, 120, 280) #the roof

root.mainloop()
