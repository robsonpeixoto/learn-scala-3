package essentials.part1basics

object Expressions:
  // expressions and structures tha can be evaluated to a value
  val meaningOfLife = 40 + 2

  // mathematical expressions: +, -, *, /, bitwise |, &, <<, >>, >>>
  val mathExpression = 2 + 3 * 4

  // comparison expressions: <, <=, >, >=, ==, !=
  val equalityTest = 1 == 2

  // boolean expressions: !, ||, &&
  val nonEqualityTest = !equalityTest

  // if are expressions
  val aCondition = true
  val anIfExpression = if aCondition then 45 else 99

  // code block
  val aCodeBlock =
    // local values
    val localValue = 78

    // last expression = value of the block
    localValue + 54

  // everything is an expression

  def main(args: Array[String]): Unit =
    println(anIfExpression)
