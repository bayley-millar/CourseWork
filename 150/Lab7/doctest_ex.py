def compare(a, b):
    """
    returns 1 if a>b, 0 if a equals b, and -1 if a<b
    >>> compare(5, 4)
    1
    >>> compare(7, 7)
    0
    >>> compare(2, 3)
    -1
    >>> compare(42, 1)
    1
    """
    if a > b:
        print "1"
    elif a == b:
        print "0"
    elif a < b:
        print "-1"

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)




def hypotenuse(a, b):
    """
    compute the hypotenuse of a right angle triangle.
    >>> hypotenuse(3, 4)
    5.0
    >>> hypotenuse(12, 5)
    13.0
    >>> hypotenuse(7, 24)
    25.0
    >>> hypotenuse(9, 12)
    15.0
    """
    c = (a**2 + b**2)
    answer= c**0.5
    print answer

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
    



    
