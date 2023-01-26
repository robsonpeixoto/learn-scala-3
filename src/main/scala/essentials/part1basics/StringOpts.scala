package essentials.part1basics

object StringOpts:
  val aString: String = "Hello, I am learning Scala"

  // string functions
  val secondChar = aString.charAt(1)
  val firstWord = aString.substring(0, 5) // "Hello"
  val words = aString.split(" ")
  val startsWithHello = aString.startsWith("Hello")
  val allDashes = aString.replace(' ', '-')
  val allUppercase = aString.toUpperCase()
  val nChars = aString.length()

  // other functions
  val reversed = aString.reverse
  val aBunchOfChars = aString.take(5)

  // parse to numeric
  val numberAsString = "2"
  val number = numberAsString.toInt

  // s-interpolation
  val name = "Alice"
  val age = 12
  val greeting = s"Hello, I'm $name and I'm $age years old."
  val party = s"Hello, I'm $name and I will be turning ${age + 1} years old."

  // f-interpolation
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  // raw-interpolation
  val escapes = raw"This is a \n newline"

@main def StringOptsMain =
  import StringOpts.*

  println("hi")
  println(greeting)
  println(party)
  println(myth)
  println(escapes)
