package essentials.part1basics

import scala.annotation.tailrec

object DefaultArgs:
  @tailrec
  def sumUntilTailRec(x: Int, accumulator: Int = 0): Int =
    if x <= 0 then accumulator
    else sumUntilTailRec(x - 1, accumulator + x)

@main def DefaultArgsMain =
  import DefaultArgs.*

  println(sumUntilTailRec(10))
  println(sumUntilTailRec(accumulator = 100, x = 2))
