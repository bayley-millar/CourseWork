Python 2.7.5 (default, Aug 25 2013, 00:04:04) 
[GCC 4.2.1 Compatible Apple LLVM 5.0 (clang-500.0.68)] on darwin
Type "copyright", "credits" or "license()" for more information.
>>> saying = "Be as happy as possible"
>>> saying[1:7]
'e as h'
>>> saying[:7]
'Be as h'
>>> saying[7:]
'appy as possible'
>>> saying[8:]
'ppy as possible'
>>> saying[10:]
'y as possible'
>>> saying[6:]
'happy as possible'
>>> saying[:3]
'Be '
>>> saying[5:10]
' happ'
>>> saying[5:11]
' happy'
>>> saying[0:15]
'Be as happy as '
>>> saying[0:23]
'Be as happy as possible'
>>> 
>>> print "be"+" as"+" happy"+" as"+" humanly"+ " possible"
be as happy as humanly possible
>>> len("be"+" as"+" happy"+" as"+" humanly"+ " possible")
31
>>> len("be"+" as"+" happy"+" as"+" possible")
23
>>> 

>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 5, in <module>
    on_many_lines(apple)
NameError: name 'apple' is not defined
>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 5, in <module>
    on_many_lines(apple)
NameError: name 'apple' is not defined
>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 5, in <module>
    on_many_lines(apple)
NameError: name 'apple' is not defined
>>> ================================ RESTART ================================
>>> 
a

p

p

l

e

>>> ================================ RESTART ================================
>>> 
a
p
p
l
e
>>> 
>>> saying = "be as happy as possible"
>>> saying.swapcase()
'BE AS HAPPY AS POSSIBLE'
>>> saying.upper()
'BE AS HAPPY AS POSSIBLE'
>>> saying.count("e")
2
>>> saying[0].isupper()
False
>>> saying[:2].isalpha()
True
>>> ================================ RESTART ================================
>>> 
>>> prefix()

Traceback (most recent call last):
  File "<pyshell#26>", line 1, in <module>
    prefix()
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 11, in prefix
    print letter + suffix
NameError: global name 'suffix' is not defined
>>>    prefixes = "JKLMNOPQ"
    sufix = "ack"
    for letter in prefixes:
        print letter + suffix
        
  File "<pyshell#27>", line 1
    prefixes = "JKLMNOPQ"
   ^
IndentationError: unexpected indent
>>> prefixes = "JKLMNOPQ"
    sufix = "ack"
    for letter in prefixes:
        print letter + suffix
        
>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 13, in <module>
    prefix("JKLMNOPQ")
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 11, in prefix
    print letter + suffix
NameError: global name 'suffix' is not defined
>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 13, in <module>
    prefix()
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 10, in prefix
    for letter in prefixes:
NameError: global name 'prefixes' is not defined
>>> ================================ RESTART ================================
>>> 

Traceback (most recent call last):
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 13, in <module>
    prefix()
  File "/home/cshome/b/bmillar/COMP150/Lab8/replace.py", line 11, in prefix
    print letter + suffix
NameError: global name 'suffix' is not defined
>>> ================================ RESTART ================================
>>> 
Jack
Kack
Lack
Mack
Nack
Oack
Pack
Qack
>>> 
