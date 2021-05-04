#!/bin/cmpld

use std::env;

fn main() {
    let args: Vec<String> = env::args().collect();

    if args.len() >= 2 {
        println!("Hello {}!", &args[1]);
    } else {
        println!("Hello World!");
    }
}
