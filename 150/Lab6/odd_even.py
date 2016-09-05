def is_even(n):
    if n%2 == 0:
        return True
    else:
        return False
    
        

def is_odd(n):
    if n%2 == 1:
        print "this is a odd"
        return True
    else:
        return False




def is_factor(n, x):
    if x%n == 0:
        return True
    else:
        return False



def hypotenuse(a, b):
    c = (a**2 + b**2)
    answer= c**0.5
    return answer



def area_of_circle(radius):
    if radius < 0:
        print "warning: radius can't be negative"
        return

    area = 3.14159 * radius**2
    return area

def area_of_snowman(a, b, c):
    x=area_of_circle(a)
    z=area_of_circle(b)
    v=area_of_circle(c)
    answer= x + v + z
    return answer




def score_summary(a, b, c, d):
    return ((b+c+d)/3.0)

av1 = score_summary("bruce", 9.5, 7.0, 8.5)
av2 = score_summary("steve", 6.0, 9.0, 9.5)
av3 = score_summary("bobby", 8.5, 7.0, 7.5)

def winner():
    print max(av1, av2, av3)





def next_level(a, b, c, d, e, f):
    score= (a + b + c + d + e + f) - min(a, b, c, d, e, f)
    m=max(a, b, c, d, e, f)
    if score > 200:
        print "pass"

    else:
        print "repeat"

    print "best score is", m





def water_state(a):
    if (int(a) > 100):
        print 'steam'
        return "H2O at" "degrees will be steam"
    elif (int(a) < 0):
        print 'ice'
        return "H2O at"+ str( a) + "degrees will be ice"
    else:
        print 'liquid'
        return "H2O at" a "degrees will be liquid"
    
    
    




        

 
    
    
    



    
    
    
    
    
    
