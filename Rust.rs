fn main() { (1..=100).for_each(|e| if e % 15 == 0 { println!("FizzBuzz") } else if e % 3 == 0 { println!("Fizz") } else if e % 5 == 0 { println!("Buzz") } else { println!("{}", e) }) }
