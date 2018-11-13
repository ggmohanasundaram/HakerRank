package hakerrankproblems.arrays

object ArrayRotation {

  def rotLeft(a: Array[Int], d: Int): Array[Int] = {

       a.drop(d) ++ a.take(d)


  }

  def main(args: Array[String]): Unit = {

    val a = Array(1,2,3,4,5)
    val bb = rotLeft(a,4)
    println(bb.mkString)
  }

}
