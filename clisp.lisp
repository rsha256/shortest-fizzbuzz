(defun is-multiple (i against) 
    (= (mod i against) 0))
(defun fizzbuzz (i)
  (let ((p (concatenate 'string (if (is-multiple i 3) "Fizz" "") (if (is-multiple i 5) "Buzz" ""))))
    (print (if (string= p "") i p))))

(dotimes (i 101) (fizzbuzz i))
