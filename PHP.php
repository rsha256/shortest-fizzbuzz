foreach (range(1, 100) as $number) {
    $isFizz = $number % 3 == 0;
    $isBuzz = $number % 5 == 0;
    $fizzBuzz = ($isFizz ? 'Fizz' : '') . ($isBuzz ? 'Buzz' : '');
    echo  !empty($fizzBuzz) ? $fizzBuzz.'<br>' : (string)$number .'<br>';
}
