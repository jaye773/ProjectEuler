import Data.List

main = putStrLn (labelInteger "Total" total)

labelInteger label number = label ++ ": " ++ show number

total = sum (nub ([3,6..999] ++ [5,10..999]))