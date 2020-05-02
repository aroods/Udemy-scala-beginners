package lectures.part1basic

import lectures.part1basic.Functions.Test2

object Functions extends App{

  def aFunction (a: String, b:Int): String = {
    a + " " + b
  }

  println(aFunction("hello",3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  def Test1 (a: String, b:Int): String = {
    "my name " + a + " and Im " + b
  }

  def Test2(n: Int): Int = {
    if (n == 1) n
    else n * Test2(n-1)
  }

  println(Test2(5))

  def Test3(n: Int): Int =
    if (n <= 2 ) 1
    else Test3(n-1) + Test3(n-2)

 println(Test3(8)) 

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
