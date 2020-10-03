/**
this is Javascript version of calssic fizz buzz
if num is divisile by 5 then print Buzz
if num is divisile by 3 print FizzBuzz
if num is divisile by 15 print FizzBuzz


this one can be run just by pulling up console on any browser
*/

//takes the maximumn number of iterations you want to perform
var max_iteration=100;

//this for loop will go from  zero to NO OF iterations
//continue statement makes the code to skip rest of for loop and continue next itteration

for(var i=0;i<=max_iteration;i++)
{


    //for each iterations if num is divisile by 15 i.e if remender(%) is zero
    if (i % 15 == 0)
    {
        console.log("FizzBuzz");
        continue;
    }

    //for each iterations if num is divisile by 3 i.e if remender(%) is zero
    if (i % 3 == 0)
    {
        console.log("Fizz");
        continue;
    }

    //for each iterations if num is divisile by 5 i.e if remender(%) is zero
    if (i % 5 == 0)
    {
        console.log("Buzz");
        continue;
    }
