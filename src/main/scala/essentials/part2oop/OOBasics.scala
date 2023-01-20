package essentials.part2oop

object OOBasics extends App {
  // classes
  class Person(val name: String, age: Int): // constructor signature
    // fields
    val allCaps = name.toUpperCase
    // methods
    def greet(name: String): Unit =
      println(s"${this.name} says: Hi $name")

    def greet(): String =
      s"Hi, everyone, my name is $name"

    // aux constructor
    def this(name: String) = this(name, 0)

  val aPerson = new Person("John", 26)

  println(aPerson.name)
  println(aPerson.allCaps)
  // println(aPerson.age) // age is not a field, only a constructor parameter
  println(aPerson.greet("pedro"))
  println(aPerson.greet())

}
