package lectures.part2oop
/**
 * Created by Arek.
 */

object OOBasics extends App {

  val person = new Person("Arek", 34)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

//constructor
class Person(name: String, val age: Int) {
  //body
  //val and var, functions(methods), expressions, other classes
  val x = 2

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name ")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")
  //  def greet(): Int = 42

  //multiple constructors
  def this(name: String) = this(name,0)

}

//class parameters in constructor is not class field (need to add Val in constructor)

