package lectures.part2oop

import java.awt.image.CropImageFilter

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String
//    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "K9"
    override def eat: Unit = println("crunch crunch")
  }

  //Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
//    val preferredMeal: String = "fresh meat" //can have non abstract values
  }

  class Crocodidile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    def eat: Unit = println("nom nom nom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eatig ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodidile

  croc.eat(dog)

  //traits vs abstract classes
  //1 - traits do not have constructor parameters
  //2 - can extends ONE class but MULTIPLE traits
  //3 - traits are behaviour, abstract class is the type of thing



}
