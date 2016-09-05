#lab15 Question 3
def mean_median(number_list):
    """
    >>> mean_median([1, 2, 3])
    (2.0, 2.0)
    >>> mean_median([1, 2, 9])
    (4.0, 2.0)
    >>> mean_median([8, 2, 2])
    (4.0, 2.0)
    >>> mean_median([2, 8, 1, 1])
    (3.0, 1.5)
    """
    sorts = sorted(number_list)
    length = len(sorts)
    sums = sum(sorts)
    
    if not length % 2:
        ans1 = (sorts[length / 2] + sorts[length / 2 - 1]) / 2.0
        median = float(ans1)
        ans2 = (sums/length)
        mean = float(ans2)
    else:
        ans1 = sorts[length / 2]
        median = float(ans1)
        ans2 = (sums/length)
        mean = float(ans2)


    return (mean, median)

    
if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)



#Question 4
def letters(string):
    



    
            

    
        
        
    
