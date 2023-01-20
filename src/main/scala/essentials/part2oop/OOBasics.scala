package essentials.part2oop

import java.time.LocalDate

object OOBasics extends App:

  // classes
  class Person(val name: String, age: Int): // constructor signature
    // aux constructor
    def this(name: String) = this(name, 0)
    // fields
    val allCaps = name.toUpperCase
    // methods
    def greet(name: String): Unit =
      println(s"${this.name} says: Hi $name")
    def greet(): String =
      s"Hi, everyone, my name is $name"

  class Writer(firstName: String, lastName: String, val yearOfBirth: Int):
    def fullName: String = s"$firstName $lastName"

  class Novel(title: String, yearOfRelease: Int, author: Writer):
    def authorAge: Int = yearOfRelease - author.yearOfBirth
    // FIXME: create a equals and hash methods on Writer
    def isWrittenBy(author: Writer): Boolean = this.author == author
    def copy(newYear: Int): Novel = new Novel(title, newYear, author)

  // Immutable counter
  class Counter(count: Int = 0):
    def increment: Counter = increment(1)
    def increment(n: Int): Counter = new Counter(count + n)
    def decrement: Counter = decrement(1)
    def decrement(n: Int): Counter = increment(-n)
    def print: Unit = println(count)

  println("== PERSON ==")
  val aPerson = new Person("John", 26)
  println(aPerson.name)
  println(aPerson.allCaps)
  // println(aPerson.age) // age is not a field, only a constructor parameter
  println(aPerson.greet("pedro"))
  println(aPerson.greet())

  println("== NOVEL + WRITER ==")
  val author = new Writer("Joao", "Maria", 1983)
  val authorFaker = new Writer("JoAo", "Maria", 1983)
  println(author.fullName)
  val novel = new Novel("My book", 1990, author)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(authorFaker))
  println(novel.authorAge)
  println(novel.copy(2000).authorAge)

  println("== COUNTER ==")
  val c = new Counter(10)
  c.increment.print
  c.decrement.print
  c.decrement(5).print
  c.increment(5).print
