#question 1
def print_powers(n, high):
    i = 1
    while i <= high:
        print n**i, '\t',
        i += 1
    print

#question 2
def print_powers_table(high):
    i = 1
    while i <= high:
        print_powers(i, high)
        i += 1
#question 3
def is_prime(n):
    if n < 2:
        return False
    elif n >= 2:
        k = 2
        while k <= n/2:
            if n%k == 0:
                return False
            k=k+1
        return True

#question 4
def is_prime_table(n):
    prime = ""
    k = 2
    while k <= n:
        if is_prime(k):
            print k
        k=k+1

            
            
    
    
