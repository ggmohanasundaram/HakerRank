package hakerrankproblems.algorithms

object AngryProff {
  // Complete the angryProfessor function below.
  def angryProfessor(k: Int, a: Array[Int]): String = {
    val filtered = a.filter(x => x <= 0)
    if(filtered.length >= k)
      "YES"
    else "NO"

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val result = angryProfessor(4, Array(-93 ,-86, 49, -62, -90 ,-63, 40 ,72, 11, 67))

    println(result)

     /*val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val nk = stdin.readLine.split(" ")

      val n = nk(0).trim.toInt

      val k = nk(1).trim.toInt

      val a = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = angryProfessor(k, a)

      println(result)*/
    //}

    //printWriter.close()
  }

}
