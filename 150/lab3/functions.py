def new_line():
    print

def three_lines():
    new_line()
    new_line()
    new_line()

def nine_lines():
    three_lines()
    three_lines()
    three_lines()

def clear_screen():
    nine_lines()
    nine_lines()
    nine_lines()
    nine_lines()
    three_lines()
    new_line()
    


print("first line")
clear_screen()
print("second line")
clear_screen()
print("third line")

#Q4.if nine lines was above three lines it would not work because three lines and
#not been been defined yet.

