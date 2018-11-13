package hakerrankproblems.arrays

object NewYearChaos {

  // Complete the minimumBribes function below.
  def minimumBribes(q: Array[Int]) {
    val a = (1 to q.length).toArray

    val c = q.zip(a).map { case (a, b) => if (a == 0) (a, b) else (a, a - b) }

    println(c.mkString)
    val ss = c.filter(_._2 > 2)


    if (ss.length > 0) {
      println("Too chaotic")

    } else {
      val out = calculateBribe(c.toList, 0)
      println(out)
    }


    def calculateBribe(aa: List[(Int, Int)], i: Int): Int = aa match {
      case head :: second :: Nil => i
      case head :: second :: tail => {

        if (head._2 == 0) {
          calculateBribe(second :: tail, i)
        }
        else if (head._2 > 0 && ((head._1 - head._2) == second._1)) {
          calculateBribe(second :: tail, i + head._2)
        }
        else if (head._2 > 0 && ((head._1 - head._2) != second._1)) {
          calculateBribe(second :: tail, i + head._2 +(head._1 - tail.head._1))
        }
        else calculateBribe(second :: tail, i)
      }

      case _ => i

    }
  }


  def main(args: Array[String]): Unit = {
   val q = Array(1,2,5,3,7,8,6,4)
    minimumBribes(q)
  /*  val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)*/

    }


}

/*1,2,5,3,7,8,6,4

1 2 3 5 7 8 6 4
1 2 3 5 7 6 8 4
1 2 3 5 6 7 8 4
1 2 3 5 6 7 4 8
1 2 3 5 6 4 7 8
1 2 3 5 4 6 7 8
1 2 3 4 5 6 7 8*/

/*
1 2 3 4 5 6 7 8

1 2 3 5 4 6 7 8
1 2 5 3 4 6 7 8
1 2 5 3 4 7 6 8
1 2 5 3 7 4 6 8
1 2 5 3 7 6 4 8
1 2 5 3 7 6 8 4
1 2 5 3 7 8 6 4*/
