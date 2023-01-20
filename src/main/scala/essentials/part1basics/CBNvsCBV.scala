package essentials.part1basics

object CBNvsCBV extends App:
  // CBV = call by value = arguments are evaluated before function invocation
  def aFunction(arg: Int): Int = arg + 1
  val aComputation = aFunction(23 + 67)

  // CBN = call by name = arguments are passed LITERALLY
  def aByNameFunction(arg: => Int): Int = arg + 1
  val anotherComputation = aByNameFunction(23 + 67)

  def printTwiceByValue(x: Long): Unit =
    println("By value: " + x)
    println("By value: " + x)

  def printTwiceByName(x: => Long): Unit =
    println("By name: " + x)
    println("By name: " + x)

  printTwiceByValue({ println("hi"); System.nanoTime() })
  printTwiceByName({ println("hi"); System.nanoTime() })
