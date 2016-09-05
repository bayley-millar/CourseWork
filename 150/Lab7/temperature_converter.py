def fahrenheit_to_celsius(t):
    """
    >>> fahrenheit_to_celsius(212)
    100
    >>> fahrenheit_to_celsius(32)
    0
    >>> fahrenheit_to_celsius(-40)
    -40
    >>> fahrenheit_to_celsius(36)
    2
    >>> fahrenheit_to_celsius(37)
    3
    >>> fahrenheit_to_celsius(38)
    3
    >>> fahrenheit_to_celsius(39)
    4
    """

    c = ((t-32)*5)/9.0
    d = round(c)
    answer = int(d)
    return answer

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)


    
def celsius_to_fahrenheit(t):
    """
    >>> celsius_to_fahrenheit(0)
    32
    >>> celsius_to_fahrenheit(100)
    212
    >>> celsius_to_fahrenheit(-40)
    -40
    >>> celsius_to_fahrenheit(12)
    54
    >>> celsius_to_fahrenheit(18)
    64
    >>> celsius_to_fahrenheit(-48)
    -54
    """

    c = ((t*9)/5)+32
    d = round(c)
    answer = int(d)
    return answer

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
    
