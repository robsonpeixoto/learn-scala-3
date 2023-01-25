object AccessModifiers:
  class Person(val name: String):
    def sayHi(): String = s"Hi, my name is $name"

@main def accessModifiersMain(): Unit =
  import AccessModifiers.*
  val p = new Person(name = "pedro")
  println(p.sayHi())
