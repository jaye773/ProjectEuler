main = putStrLn ("Total: " ++ show fibTot)

fibTot = foldr (+) 0 fibList

fibList = (takeWhile (<=4000000) allFib)

allFib = [ addFib x | x <- [1..]] 

addFib x = returnEven (fib x)

returnEven x
	| even x = x
	| otherwise = 0

fib x
    | x >= 2 = fib (x-1) + fib (x-2)
    | x==1 = 1
    | otherwise = 0