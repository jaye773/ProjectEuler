import Data.List

main = putStrLn ("Larget Palindrome: " ++ show (last (sort allNumbers)))

allNumbers = [ x * y | x <- [100..999], y <- [100..999], isPalindrome(x*y)]

isPalindrome :: Integer -> Bool
isPalindrome num = 
	let numString = show num
	in numString == reverse numString