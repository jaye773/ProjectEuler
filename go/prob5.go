package main

import "fmt"

func main() {
	for i:= 20;true;i+=20{
		var j = 19
		for ;j>1 && (i % j == 0);j--{}
		if(j==1){
			fmt.Printf("%v\n", i)
			break;
		}
	}
}