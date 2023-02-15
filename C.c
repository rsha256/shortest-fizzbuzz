#include <stdio.h>
main(i){for(;i<101;i++)printf(i%3?i%5?"%d\n":"Buzz\n":i%5?"Fizz\n":"FizzBuzz\n",i);}
