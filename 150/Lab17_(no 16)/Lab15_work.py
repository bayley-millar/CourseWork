#Lab 15
#Q1
brendan = "Brendan", "McCane"
sandy = "Sandy", "Garner"
nick = "Nick", "Meek"
student1 = "Allan", "Anderson"
student2 = "Barry", "Byars"
student3 = "Christine", "Carver"
student4 = "Delia", "de Wattinger"

#(a)
name_list = [brendan, sandy, nick, student1, student2, student3, student4]
for person in name_list:
    print person[1]

#(b)(c)(d)(e)
owheo = set([brendan, sandy, nick, student1, student2, student3, student4])
teachers = set([brendan, sandy, nick])
students = owheo - teachers
for name in students:
    print name

#(f)
#for letter in name:
    



#Q2
def num_unique(a_list):
    """
    >>> num_unique([1, 2])
    2
    >>> num_unique([1, 2, 2, 2, 1, 2, 1, 2, 2, 1])
    2
    >>> num_unique([1, 1, 1, 1, 1])
    1
    >>> num_unique([1, 2, 3, 4, 5])
    5
    """
    
    

