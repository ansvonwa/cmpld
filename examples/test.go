#!/bin/cmpld

package main

import (
    "os"
    "fmt"
)

func main() {
    if len(os.Args) >= 2 {
        fmt.Printf("Hello %s!\n", os.Args[1])
    } else {
        fmt.Println("Hello World!")
    }
}

