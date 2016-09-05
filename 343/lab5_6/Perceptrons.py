#bayley millar
#ID 2940325
#Lab 5 and 6

from random import choice
from numpy import array, dot, random

threshold_activation = lambda x: 0 if x < 0 else 1
#original data
training_data = [
    (array([0,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0, 1]), 0),
    (array([0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0, 1]), 1), 
    (array([0,1,1,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1, 1]), 0), 
    (array([0,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,1,0, 1]), 1),
    (array([0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0, 1]), 0),
]
#test data(for flipped)
test_data = [
    (array([0,1,1,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,0, 1]), 0),
    (array([0,0,1,0,0,1,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0, 1]), 1), 
    (array([0,1,1,1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,1, 1]), 0), 
    (array([0,1,1,1,0,0,0,0,0,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,0, 1]), 1),
    (array([0,1,0,0,0,1,1,1,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0,1,0, 1]), 0),
]

w = random.rand(26)
eta = 0.2
n = 100

for i in xrange(n):
    x, expected = choice(training_data)
    result = dot(w, x)
    error = expected - threshold_activation(result)
    w += eta * error * x

#training data output    
for x, _ in training_data:
    result = dot(x, w)
    print("training data:\n{}\n{}\n{}\n{}\n{} \n{}: -> {}\n".format(x[0:5], x[5:10], x[10:15], x[15:20], x[20:25], result, threshold_activation(result)))



#spepration between data    
print("-------------------------")



#output for test data
for x, _ in test_data:
    result = dot(x, w)
    print("test data:\n{}\n{}\n{}\n{}\n{} \n{}: -> {}\n".format(x[0:5], x[5:10], x[10:15], x[15:20], x[20:25], result, threshold_activation(result)))