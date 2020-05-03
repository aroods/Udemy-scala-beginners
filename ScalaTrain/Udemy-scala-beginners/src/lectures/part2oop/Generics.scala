package lectures.part2oop

object Generics extends App {

  class MyList[+A] { // added + to make it Covariant
    //use type A inside class definition
    def add[B >: A](element: B): MyList[B] = ???

  }
  class MyMap[Key, Value] {}

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generics methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegeres = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ? HARD QUESTION

  //2. NO = INVARIANCE
  class InvarinteList[A]
  val invarianteAnimalList: InvarinteList[Animal] = new InvarinteList[Animal]

  //3. HELL NO! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal]  (animal: A)//A only accepts subtypes of Animal - upper bounded
  val cage = new Cage(new Dog)
  class Car
//  val newCage = new Cage(new Car) //wont work







}
