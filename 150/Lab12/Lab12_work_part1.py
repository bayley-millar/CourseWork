#Question 1:
#a
"{} {:d} {:f}".format(5, 5, 5)
'5 5 5.000000'
#b
"{:>.2f}".format(3)
'3.00'
#c
"{:>10.2f}{:>10.2f}".format(7, 1.0/2)
'      7.00      0.50'
#d
print "${:5.2f}\n${:5.2f}\n${:5.2f}".format(3, 4.5, 11.2)
#$ 3.00
#$ 4.50
#$11.20


#Question 2:
#a  
"{} {} {}".format("this", "that", "something")
#b
"{} {} {} {}".format("yes", "no", "up", "down")
#c
