package essentials.part1basics

import scala.annotation.tailrec

object Functions:

  // function = reusable piece of code that you can invoke with some arguments and return a result
  def aFunction(a: String, b: Int): String =
    a + " " + b // ONE expression

  val aFunctionInvocation = aFunction("Scala", 999999999)

  def aNoArgFunction(): Int = 45
  def aParameterlessFunction: Int = 45

  // function can be recursive
  def stringConcatenation(str: String, n: Int): String =
    if n == 0 then ""
    else if n == 1 then str
    else str + stringConcatenation(str, n - 1)

  val scalax3 = stringConcatenation("Scala", 3)

  // "void" functions
  def aVoidFunction(aString: String): Unit =
    println(aString)

  // discouraging side effects
  def computeDoubleStringWithSideEffect(aString: String): String =
    aVoidFunction(aString) // Unit
    aString + aString

  def aBigFunction(n: Int): Int =
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n + 1)

  def greeting(name: String, age: Int): String =
    s"Hi my name is ${name} and I am ${age} years old."

  def factorial(n: Int): Int =
    @tailrec
    def rec(n: Int, acc: Int): Int =
      if n == 0 then 0
      else if n == 1 then acc
      else rec(n - 1, acc * n)
    rec(n, 1)

  def fibonacci(n: Int): Int =
    @tailrec
    def rec(i: Int, p1: Int, p2: Int): Int =
      if i == n then p1 + p2
      else rec(i + 1, p2, p1 + p2)

    if n <= 0 then 0
    else if n == 1 then 1
    else if n == 2 then 1
    else rec(3, 1, 1)

  def isPrime(n: Int): Boolean =
    def rec(i: Int, res: Boolean): Boolean =
      if i == 1 then res
      else rec(i - 1, res && (n % i != 0))

    if n <= 0 then false
    else if n == 1 then true
    else rec(n - 1, true)

  def main(args: Array[String]): Unit =
    println(s"0 => ${isPrime(0)}")
    println(s"1 => ${isPrime(1)}")
    println(s"2 => ${isPrime(2)}")
    println(s"3 => ${isPrime(3)}")
    println(s"4 => ${isPrime(4)}")
    println(s"5 => ${isPrime(5)}")
