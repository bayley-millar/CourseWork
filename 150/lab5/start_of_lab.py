#question 4
def water_state():
    print('enter a number')
    a= raw_input()
    if (a > 100):
        print 'steam'
    elif (a < 0):
        print 'ice'
    else:
        print 'liquid'

water_state()






print("")
print("")
print("")
print("")
print("")



#question 3
def is_divisable_by_3():
    print "enter a number that can be divided by 3"
    a= raw_input()
    if (int(a)%3) == 0:
        print ("this number can be divided by 3")
    else:
        print "this number can not be divided by 3"


is_divisable_by_3()   








print("")
print("")
print("")
print("")
print("")




#question 2
def compare(x, y):
    if (x < y):
        print (x, "is less than", y)
    elif (x > y):
        print (x, "is greater than", y)
    else:
        print (x, "and", y, "are equal")

compare(1, 3)
compare(3, 1)
compare(3, 3)
        
