package essentials.part2oop

object MethodNotation:
  class Person(val name: String, val age: Int, favoriteMovie: String):
    infix def likes(movie: String): Boolean = movie == favoriteMovie
    infix def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    infix def +(nickname: String): Person = new Person(s"$name ($nickname)", age, favoriteMovie)
    infix def !!(progLanguage: String): String =
      s"${this.name} wonders how can ${progLanguage} be so cool!"
    def unary_- : String = s"$name's alter ego"
    def unary_+ : Person = new Person(name, age + 1, favoriteMovie)
    def apply(): String = s"Hi, my name is $name and I really enjoy $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

@main def MethodNotationMain =
  import MethodNotation.*

  val mary = new Person("Mary", 34, "Inception")
  val john = new Person("John", 36, "Fight Club")
  println(mary.likes("Fight Club"))
  println(mary likes "Fight Club") // infix notation - for methods with ONE argument
  println(mary + john)
  println(mary !! "Scala")
  // prefix position
  println(-mary)
  println(mary.unary_-)
  // object like a function
  println(mary.apply())
  println(mary())
  // samples
  println(mary + "the rockstar")
  val maryOlder = +mary
  println(maryOlder.age)
  println(mary(2))
