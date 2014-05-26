package main

import "fmt"

func main() {
	var result, first, second, sum int = 0, 0, 1, 0
	for ; result < 4000000; {
		result = first + second
		first = second
		second = result
		if(result % 2 == 0){
			sum += result
		}
	}
    fmt.Printf("Sum: %v\n", sum)
}