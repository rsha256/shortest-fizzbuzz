fn main() {
  (1..=100).for_each(|x| println!("{}", match (x%3, x%5) {(0,0) => "FizzBuzz".into(), (0, _) => "Fizz".into(), (_,0) => "Buzz".into(), (_,_) => x.to_string()}))
}