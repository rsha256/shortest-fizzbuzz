package main

import . "fmt"

func main() {
	p, i := Print, 1
	for i < 101 {
		if i%3 < 1 {
			p("Fizz")
		}
		if i%5 < 1 {
			p("Buzz")
		}
		if i%3*i%5 > 0 {
			p(i)
		}
		p("\n")
		i++
	}
}
