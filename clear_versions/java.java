/**
this is python version of calssic fizz buzz
if num is divisile by 5 then print Buzz
if num is divisile by 3 print FizzBuzz
if num is divisile by 15 print FizzBuzz

to run this file you need jdk 1.5 + installed on your machine
then first compile the file by
javac java.java
then run 
java FizzBuzz
*/


class FizzBuzz
{
    public static void main(String [] args)
    {
      //takes the maximumn number of iterations you want to perform
      int max_iteration=100;

      //this for loop will go from  zero to NO OF iterations
      //continue statement makes the code to skip rest of for loop and continue next itteration

      for(int i=0;i<=max_iteration;i++)
      {


          //for each iterations if num is divisile by 15 i.e if remender(%) is zero
          if (i % 15 == 0)
          {
              System.out.println("FizzBuzz");
              continue;
          }

          //for each iterations if num is divisile by 3 i.e if remender(%) is zero
          if (i % 3 == 0)
          {
              System.out.println("Fizz");
              continue;
          }

          //for each iterations if num is divisile by 5 i.e if remender(%) is zero
          if (i % 5 == 0)
          {
              System.out.println("Buzz");
              continue;
          }

      }
    }
}
