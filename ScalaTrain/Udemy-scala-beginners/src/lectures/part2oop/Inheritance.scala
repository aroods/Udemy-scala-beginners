package lectures.part2oop

object Inheritance extends App {

//Single class inheritance
//  final / sealed class Animal {
class Animal {
    /*final*/ def eat = println("nomnom")
    val creatureType = "Wild"
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat

  //constructors
  class Person(name: String, age: Int)
  class Adults(name: String, age: Int, idCard: String) extends Person(name, age)

  //overriding
  class Dog extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch")
    }

    override val creatureType: String = "domestic"
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  //type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog()

  //overriding vs overloading

  //super

  //preventing overrides
  //1 - use final keyword on member
  //2 - use final on entire class
  //3 - seal the class = extend classes in THIS FILE but prevents extension in OTHER FILES


}
