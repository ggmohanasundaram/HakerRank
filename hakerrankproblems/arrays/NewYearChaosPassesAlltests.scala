package hakerrankproblems.arrays

import scala.collection.mutable.ListBuffer
import scala.util.Sorting

object NewYearChaosPassesAlltests {


  def bubblesort[A <% Ordered[A]](list: List[A], count: Int): Int = {

    def sortInner(input: List[A], tempList: List[A], i: Int): (List[A], Int) = input match {
      case h1 :: h2 :: tail => if (h1 > h2) sortInner(h1 :: tail, h2 :: tempList, i + 1)
      else sortInner(h2 :: tail, h1 :: tempList, i)
      case h1 :: Nil => (tempList, i)

    }

    def sort(input: List[A], count: Int): Int = {

      if (input.isEmpty) count
      else {
        val inner_result = sortInner(input, List.empty, 0)
        inner_result match {
          case (a, 0) => count
          case (a, b) => {
            sort(a.reverse, count + b)
          }

        }
      }
    }

    sort(list, 0)


  }


  def main(args: Array[String]): Unit = {
    // val q = Array(2, 1, 5, 3, 4)
    val q = Array(1, 2, 5, 3, 7, 8, 6, 4)
    println(bubblesort(q.toList, 0))

    /*val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)
  */
  }


}
