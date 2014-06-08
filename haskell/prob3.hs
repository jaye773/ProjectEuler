main = putStrLn ("All factors: " ++ show (allPrimeFactors 600851475143))

isPrime :: Integer -> Bool
isPrime k = null [ x | x <- [2..k - 1], k `mod`x  == 0]

-- k = possible factor
-- x = the number of factor
isFactor :: Integer -> Integer -> Bool
isFactor k x = x `mod`k  == 0

allPrimeFactors :: Integer -> [Integer]
allPrimeFactors num = [ x | x <- [1..(floor.sqrt.fromIntegral)(num)] , (isFactor x num) && isPrime x ] 