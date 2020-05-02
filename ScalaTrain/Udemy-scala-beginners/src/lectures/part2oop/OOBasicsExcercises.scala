package lectures.part2oop

object OOBasicsExcercises extends App {
  val writer = new Writer("Jan", "Kochanowski", 1902)
  writer.fullName()

  val novel = new Novel("Opowiesc", 1950, writer)

  novel.authorAge()
  novel.isWrittenBy()
  val newNovel = novel.copy(1960)
  newNovel.authorAge()
  newNovel.isWrittenBy()

  val v = new Counter(10)
  v.currentCount()

  v.increment.currentCount()

  v.increment.decrement(5).currentCount()

}

class Writer(fname: String, lname: String, val birthYear: Int)  {

  val fullname = fname + " " + lname

  def fullName(): Unit = println(s"Writer $fullname was born in $birthYear")

}

class Novel(name: String, relYear: Int, author: Writer) {
  def authorAge(): Unit = {
    println(s"Author was ${relYear - author.birthYear} old")
  }

  def isWrittenBy(): Unit = println(s"$name is written by ${author.fullname}")

  def copy(newRelYear: Int): Novel = new Novel(this.name, newRelYear, this.author)

}


class Counter (x: Int) {

  def currentCount(): Unit = println(s"Current counter: $x")

//  def increment(): Counter = new Counter(x + 1)
  def increment = new Counter(x + 1)

  def decrement(): Counter = new Counter(x - 1)

//  def increment(param: Int): Counter = new Counter(x + param)
  def increment(param: Int) = new Counter(x + param)

  def decrement(param: Int): Counter = new Counter(x - param)



}