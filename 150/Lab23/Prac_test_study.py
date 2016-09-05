#STUDY

#Lab11, Q5
    #spell_check('spell_check.txt')
    #/usr/share/dict/words
import os
def spell_check(filename):
    openfile = open(filename, "r")
    openfile2 = open("/usr/share/dict/words", "r")

    read = openfile.read()
    readDict = openfile2.read()

    words = read.split()
    wordsDict = readDict.split()
    print type(wordsDict)

    answer = ""
    for word in words:
        if word in wordsDict:
            answer = answer + " " + word
        else:
            answer = answer + " #this word was wrong# "
    return answer



#Lab12, Q4
    #count_apluses('count_apluses.txt')
def count_apluses(filename):
    openfile = open(filename, 'r')
    read = openfile.read()
    words = read.split()
    count = 0
    
    for word in words:
        number = float(word)
        if (number >= 90 and number <= 100):
            count += 1
    return "there was ", count, " numbers between 90 and 100"
        
    
    
    
            
    
