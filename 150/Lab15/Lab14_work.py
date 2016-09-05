#past work
def first_x_vowels(filename, x):

    openfile = open(filename, "r")
    textstring = openfile.read()
    print textstring
    vowels = ("AEIOUaeiou")
    new_word = ""
    count = 0
    for letter in textstring:
        if (letter in vowels and count <=  x):
            count = count + 1
            new_word += letter
    return new_word

#lab 14 Q1
a = [1, 2, 3]
b = a[:]
b[0] = 5

#Q2
song = "the rain in spain..."
"".join(song.split())

#Q3
this = ["I", "am", "not", "a", "crook"]
that = ["I", "am", "not", "a", "crook"]
print "Test 1: {}".format(id(this) == id(that))
that = this
print "Test 2: {}".format(id(this) == id(that))
# test 1 ame back with the answer false and test 2 came back with true.

#Q4
def add_lists(a, b):
    for i in range(len(a)):
        a[i] += b[i]
    return a

list1 = [1,2,3]
list2 = [3,4,6]
list3 = add_lists(list1, list2)
print list1
print list2
print list3

#output[4, 6, 9]
#[3, 4, 6]
#[4, 6, 9]



#question 5
def myreplace(s, old, new):
    new_word = ""
    while index < len(old):
        if s[old]    == old
            
            
            
        
