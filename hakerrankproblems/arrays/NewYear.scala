package hakerrankproblems.arrays

object NewYear {

  def bubblesort[A <% Ordered[A]](list: List[A]): (List[A], Int) = {
    def sort(as: List[A], bs: List[A], total_swap: Int): (List[A], Int) =
      if (as.isEmpty) (bs, total_swap)
      else bubble(as, Nil, bs, total_swap)

    def bubble(as: List[A], zs: List[A], bs: List[A], total_swap: Int): (List[A], Int) = as match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs, total_swap + 1)
        else bubble(h2 :: t, h1 :: zs, bs, total_swap)
      case h1 :: Nil => sort(zs.reverse, h1 :: bs, total_swap)
    }

    sort(list, Nil, 0)
  }

  def minimumBribes(q: Array[Int]) {
    val a = (1 to q.length).toArray

    val c = q.zip(a).map { case (a, b) => if (a == 0) (a, b) else (a, a - b) }

    val ss = c.filter(_._2 > 2)


    if (ss.length > 0) {
      println("Too chaotic")

    } else {
      val out = bubblesort(q.toList)
      println(out._2)
    }
  }


  def main(args: Array[String]): Unit = {
    /* val q = Array(2, 1, 5, 3, 4)
    //val q = Array(1,2,5,3,7,8,6,4)
    minimumBribes(q)*/

    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)

    }
  }

}
