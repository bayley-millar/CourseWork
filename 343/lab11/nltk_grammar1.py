#NLTK code defining a simple grammar, and demonstrating some simple parsing and generating functions. 
#Alistair Knott, 10/5/2016

import nltk;
import nltk.parse.chart;
from nltk.parse.generate import generate;
from nltk.app import rdparser_app;

#Define a grammar. (This is the grammar from Lecture 21.)
grammar1 = nltk.CFG.fromstring("""
S -> NP VP
NP -> PN V0
NP -> Det N
NP -> V1 PN V1
NP -> V0 PN V0
VP -> V0 PN NP PN V0
VP -> V1 PN NP V1
S -> S Conj S
PN -> V1 Det N
PN -> V0 Det N
PN -> Det N V1
PN -> Det N V0
Det -> "the" | "a"
N -> "dog" | "cat"
PN -> "Fred" | "Jip"
V0 -> "slept" | "ran" | "snorted" | "thinks"
V1 -> "bit" | "chased" | "caught"
Conj -> "and" | "so"
""");


#demo_parse(string, grammar) finds all the parses of string permitted by grammar.
#The function uses a type of parser called a chart parser,that can handle recursion, 
#and that finds all possible parses, reasonably efficiently.
#E.g. demo_parse("Fred ran", grammar1)  
def demo_parse(string, grammar):
        left_corner_chart_parser(string, grammar);

#left_corner_chart_parser implements a particular style of chart parser, with a 'left-corner' parsing
#strategy, which combines bottom-up parsing with top-down parsing. 
def left_corner_chart_parser(string, grammar):
    
    #tokenise the input string
    tokens = string.split();
    
    #create a chart parser (with a left-corner strategy) using our grammar
    LC_STRATEGY = [nltk.parse.chart.LeafInitRule(),
                   nltk.parse.chart.FilteredBottomUpPredictCombineRule(),
                   nltk.parse.chart.FilteredSingleEdgeFundamentalRule()];
    cp = nltk.parse.chart.ChartParser(grammar1, LC_STRATEGY, trace=False);

    #run the chart parser on the tokens
    chart = cp.chart_parse(tokens);
    
    #find all the parses of the distinguished symbol of the grammar ('S', in our case)
    parses = list(chart.parses(grammar.start()));
    
    #if there are no parses, report failure.. otherwise, display the parses that were found.
    if not parses:
        print("No parses found!");
    else:
        for tree in parses: 
            print(tree);
            tree.draw(); 

#create_sentences systematically produces sentences that your grammar allows. 
# - max_depth is the maximum allowed depth of the parse tree
# - max_sentences is the maximum number of sentences that will beproduced
def create_sentences(grammar, max_depth=None, max_sentences=10):
    for sent in generate(grammar1, depth=max_depth, n=max_sentences):  
        
        #Each sent is a list of words (represented as unicode strings). To display a sentence
        #the strings are concatenated, with spaces in between. 
        print(' '.join(sent));

#top_down_parser_demo(string, grammar) runs an interactive app showing how a top-down parser works 
#on this string. (The parser used is a 'recursive-descent' parser.)
def top_down_parser_demo(string, grammar):
    
    #tokenise the string into words
    tokenized_string = string.split();

    #run the app 
    nltk.app.rdparser_app.RecursiveDescentApp(grammar1, tokenized_string).mainloop();
