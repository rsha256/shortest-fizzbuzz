 void test(int n)
 {
  bool is_fizz = test_fizz(n);
  bool is_buzz = test_buzz(n);
  if (is_fizz || is_buzz) {
	if (is_fizz) output_fizz();
	if (is_buzz) output_buzz();
  } else {
	output_number(n);
  }
  output_end_of_line();
 }

