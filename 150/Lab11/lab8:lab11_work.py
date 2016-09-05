#lab 8, Q7
def remove_letter(letter, string):
    without_letter = ""
    for char in string:
        if letter != char:
            without_letter += char

    print without_letter


#lab 8, Q8
def reverse(s):
    answer = ""
    for char in s:
        answer = char + answer
    return answer

#lab 8, Q9
def mirror(s):
    reverse = ""
    for char in s:
        reverse = char + reverse
    print s + reverse

#lab 8, Q0
def remove_duplicates(s)

