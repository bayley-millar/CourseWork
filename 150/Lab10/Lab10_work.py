#question 1
def num_digits(n):
    #"""
    #>>> num_digits(12345)
    #5
    #>>> num_digits(0)
    #1
    #>>> num_digits(-12345)
    #5
    #"""
    
    count = 0
    n = abs(n)
    if n == 0:
        return 1
    while n > 0:
        count = count + 1
        n = n / 10
    return count
    





#question 2
def num_even_digits(n):
    #"""
    #>>> num_even_digits(123456)
    #3
    #>>> num_even_digits(2468)
    #4
    #>>> num_even_digits(1357)
    #0
    #>>> num_even_digits(2)
    #1
    #>>> num_even_digits(20)
    #2
    #"""
    
    count = 0
    while n!=0:
        digit=n%10
        if ( digit%2==0):
                    count = count + 1
        n = n/10
    return count


#quetion 3
def print_digits(n):
    """
    >>> print_digits(13789)
    9 8 7 3 1
    >>> print_digits(39874613)
    3 1 6 4 7 8 9 3
    >>> print_digits(213141)
    1 4 1 3 1 2
    """
    string = str(n)
    reverse = ""
    for char in string:
        reverse = char + reverse
    return reverse
        
    
    

    






if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
        
    
    
