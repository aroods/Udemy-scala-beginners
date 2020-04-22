package lectures.part1basic

object ValuesVariablesTypes extends App {

  val x =  42
  println(x)

  //VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String =  "hello"

  val aBoolean: Boolean = true
  val aChar: Char = 's'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 2934789503247303L //L at the end to mark long numbers
  val aFloat: Float = 2.2f
  val aDouble: Double = 2.2


  //variables

  var aVariable: Int = 4

  aVariable = 5 // side effects





}
