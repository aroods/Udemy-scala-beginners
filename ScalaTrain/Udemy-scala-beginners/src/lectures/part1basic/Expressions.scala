package lectures.part1basic

object Expressions extends App {

  val x = 1 + 2 //expression
  println(x)

  println(2 + 3 * 4)

  println(!(1 == x))

  var aVariable = 2
  //Instruction (DO) vs expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0

  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWierdValue = (aVariable = 3)

  println(aWierdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbay"

  }



}
