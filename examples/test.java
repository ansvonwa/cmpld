#!/bin/cmpld

public class test {
	public static void main(String[] args) {
		if (args.length >= 1) {
			System.out.println("Hello " + args[0] + "!");
		} else {
			System.out.println("Hello World!");
		}
	}
}

