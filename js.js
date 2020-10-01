let i=1
while(i<=100){
    let w=(i%3==0?'Fizz':'')+(i%5==0?'Buzz':'')
    console.log(w==''?i:w)
    i++
}