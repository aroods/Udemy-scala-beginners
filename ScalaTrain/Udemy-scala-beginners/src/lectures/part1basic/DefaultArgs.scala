package lectures.part1basic
/**
 * Created by Arek.
 */


object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) 1
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10)


  def savePicture(format: String, width: Int, height: Int): Unit = println("saving picture")

  savePicture("jpg", 800, 600)


}
