(define (fizzbuzz n)
    (define (helper i n)
        (if (<= i n)
            (begin 
                (cond 
                    ((= 0 (remainder i 15)) (display "fizzbuzz") (newline))
                    ((= 0 (remainder i 5)) (display "fizz") (newline))
                    ((= 0 (remainder i 3)) (display "buzz") (newline))
                    (else (display i) (newline)))
                (helper (+ i 1) n))))
    (helper 1 n))