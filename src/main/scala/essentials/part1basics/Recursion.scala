package essentials.part1basics

import scala.annotation.tailrec

object Recursion:

  def sumUntil(n: Int): Int =
    if n <= 0 then 0
    else n + sumUntil(n - 1)

  def sumUntilTailRec(n: Int): Int =
    @tailrec
    def rec(x: Int, acc: Int): Int =
      if x <= 0 then acc
      else rec(x - 1, acc + x)
    rec(n, 0)

  def sumNumbersBetween(a: Int, b: Int): Int =
    @tailrec
    def rec(from: Int, to: Int, acc: Int): Int =
      if from > to then acc
      else rec(from + 1, to, acc + from)
    if a > b then rec(b, a, 0)
    else rec(a, b, 0)

  def stringConcatenation(str: String, n: Int): String =
    def rec(n: Int, acc: String): String =
      if n == 0 then acc
      else rec(n - 1, acc + str)
    rec(n, "")

  def main(args: Array[String]): Unit =
    println(stringConcatenation("oi", 3))
    println(stringConcatenation("oi", 0))
    println(stringConcatenation("oi", 1))
