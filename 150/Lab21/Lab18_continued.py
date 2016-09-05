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
        >>> r2.width = 200
        >>> r1.equals(r2)
        True
        >>> r2.height = 200
        >>> r1.equals(r2)
        False
        """
        return self.width == otherRect.width and self.height == otherRect.height and self.corner.x == otherRect.corner.x and self.corner.y == otherRect.corner.y      

    def move(self, dx, dy):
        for p in self.points:
            p.move(dx, dy)



class polygon:
    """
    A polygon class
    """
    def __init__(self):
        self.points = []

    def add_point(self, x, y):
        self.points.append(point(x, y))

    def get_point(self, index):
        if 0 < index < len(self.points):
            return self.points[index]
        else:
            return None

    def remove_point(self, index):
        if 0 < index < len(self.points):
            del self.points[index]

    def move(self, dx, dy):
        for p in self.points:
            p.move(dx, dy)

    def get_point_index(self, pt):
        """
        search through the points in th polygon and return the index
        if the passed in point is found, or -1 otherwise.
        """
        index = -1
        for i,p in enumerate(self.points):
            if p.equals(pt):
                index = i
        return index

    def __str__(self):
        s = ""
        for p in self.points:
            s += str(p) + "; "
        return s

    def equals(self, p2):
        eq = len(self.points) == len(p2.points)
        for p1,p2 in zip(self.points, p2.points):
            eq = eq and p1.equals(p2)
        return eq

    def insert_point_at(self, pt, index):
        if index < 0:
            a=self.insert(0, pt)
        elif index >= 0:
            a=self.insert(index.append(pt))
        return a

    def centre(self):
        len(index)
            

        
        
        
    
            

                         





if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)






