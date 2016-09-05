#Lab 18 work
#Question 1
import math
class Point:
    """A class to represent a 2d point"""
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def move(self, dx, dy):
        self.x += dx
        self.y += dy

    def distance(self, p2):
        dx = self.x - p2.x
        dy = self.x - p2.x
        return math.sqrt (dx*dx+dy*dy)

    def equals(self, p2):
        return (self.x == p2.x) and (self.y == p2.y)



    

class Rectangle:
    def __init__(self):
        self.corner = Point()
        self.width = 100
        self.height = 100

    def centre(self):
        c = Point()
        c.x = self.corner.x + self.width/2.0
        c.y = self.corner.y + self.height/2.0
        return c

    def equals(self, otherRect):
        """
        Test if this rectangle is equal to otherRect. Deep equality should be tested.
        >>> r1 = Rectangle()
        >>> r1.corner.x = 50
        >>> r1.corner.y = 40
        >>> r1.width = 200
        >>> r2 = Rectangle()
        >>> r2.corner.x = 50
        >>> r2.corner.y = 40
        >>> r1.equals(r2)
        True
        >>> r2.height = 200
        >>> r1.equals(r2)
        False
        """
        return self.width == otherRect.width and self.height == otherRect.height and self.corner.x ==

    def move(self, dx, dy):
        for p in self.points:
            p.move(dx, dy)

    def insert_point_at(self, pt, index

                         




#if __name__ == "__main__":
    #import doctest
    #doctest.testmod(verbose=True)





