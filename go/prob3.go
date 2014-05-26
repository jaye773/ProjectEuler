package main

import "fmt"

func IsPrime(num uint64) bool{
	var i uint64 = 2
	for ;i<num; i++{
		if(num % i == 0){
			return false
		}
	}
	return true
}

func main() {
	var num, i uint64 = 600851475143, 2
	for ; i*i< num ; i++ {
		if num % i == 0 && IsPrime(i){
			fmt.Printf("%v\n", i)
		}
	}
}