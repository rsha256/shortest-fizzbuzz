void main() {
    for(int i=0;i++<100;System.out.println((i%3<1?"Fizz":"")+(i%5<1?"Buzz":i%3>0?i:"")));
}
