def import_file():
    import os
    print os.path.isdir("/home/cshome/b/bmillar/COMP150")
    print "what file do you want opened?"
    answer = raw_input()
    wordsfile = open("/home/cshome/b/bmillar/COMP150/"+answer, "r")
    wordlist = wordsfile.readlines()
    print wordlist
    print ""
    import urllib2
    print "what webpage do you want opened"
    answer2 = raw_input()
    pagefile = urllib2.urlopen(answer2)
    page = pagefile.read()
    print page
    

#http://www.cs.otago.ac.nz




