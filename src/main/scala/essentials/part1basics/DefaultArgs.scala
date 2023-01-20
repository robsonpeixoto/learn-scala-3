package essentials.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App:
  @tailrec
  def sumUntilTailRec(x: Int, accumulator: Int = 0): Int =
    if (x <= 0) accumulator
    else sumUntilTailRec(x - 1, accumulator + x)

  println(sumUntilTailRec(10))
  println(sumUntilTailRec(accumulator = 100, x = 2))
