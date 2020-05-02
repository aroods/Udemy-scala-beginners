package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String ) {
    def likes (movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  //infix notation = operator notation - example of syntactic sugar

  //"operators" is Scala

  val tom = new Person("Tom", "Fight Club")

  println(mary hangoutWith tom)

  //prefix notation
  val x = -1
  val y = 1.unary_- //equivalent
  // unary_prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  //postfix notations
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //call out apply method

}
