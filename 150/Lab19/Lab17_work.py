#Lab 17
#Question 1

class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def __str__(self):
        self.x = x
        self.y = y
        return ("(" + str(self.x) + "," + str(self.y) + ")")
        
        

x = 5
y = 3
p = Point()
print(p)

        


#Question 2
class Vec2D:
    def __init__(self):
        self.x = 0
        self.y = 0

    def __add__(self, other):
        val = Vec2D()
        val.x = self.x + other.x
        val.y = self.y + other.y
        return (val)

    def __sub__(self, other):
        val2 = Vec2D()
        val2.x = self.x - other.x
        val2.y = self.y - other.y
        return (val2)

    def __mul__(self, other):
        val3 = Vec2D()
        val3.x = (float(self.x)) * (float(other.x))
        val3.y = (float(self.y)) * (float(other.y))
        return (val3)
        

a = Vec2D()
a.x = 2
a.y = 3
b = Vec2D()
b.x = 4
b.y = 5
c = a * b
print c.x, c.y


        
    
        
        
        
