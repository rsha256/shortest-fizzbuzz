"""
This is python version of calssic fizz buzz

if num is divisile by 5 then print Buzz
if num is divisile by 3 print FizzBuzz
if num is divisile by 15 print FizzBuzz

this can be run by installing python 2 or 3 and
python python.py
"""

#takes the maximumn number of iterations you want to perform
max_iteration=100

#this for loop will go from  zero to NO OF iterations
#continue statement makes the code to skip rest of for loop and continue next itteration
for i in range(max_iteration+1):


    #for each iterations if num is divisile by 15 i.e if remender(%) is zero
    if i % 15 == 0 :
        print("FizzBuzz")
        continue

    #for each iterations if num is divisile by 3 i.e if remender(%) is zero
    if i % 3 == 0 :
        print("Fizz")
        continue

    #for each iterations if num is divisile by 5 i.e if remender(%) is zero
    if i % 5 == 0:
        print("Buzz")
        continue
