#!/bin/cmpld

object test {
  def main(args: Array[String]): Unit = args.toList match {
    case Nil => println("Hello World!")
    case name :: _ => println(s"Hello $name!")
  }
}

