f n|(n`mod`3==0)="Fizz"++(b(1>0)n)
 |1>0=(b(1<0)n)
b x n|n`mod`5==0="Buzz"
 |x=""
 |1>0=show n
main=mapM(putStrLn.f)[1..100]
