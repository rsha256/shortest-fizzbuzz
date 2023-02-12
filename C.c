#include <stdio.h>
int main(){for(int i=1;i<=100;i++)printf(i%3?i%5?"%d\n":"Buzz\n":i%5?"Fizz\n":"FizzBuzz\n",i);return 0;}
