package hakerrankproblems.sorting

object MarkToys {


  def maximumToys(prices: Array[Int], k: Int): Int = {

    val sorted = prices.toList.sortWith(_ < _)
    sorted.foldLeft(Some(k, 0): Option[(Int, Int)]) {
      case (Some((-999,c)), b) => return c
      case (a, b) => if (a.get._1 > b) Some(a.get._1 - b, a.get._2 + 1) else Some(-999,a.get._2)
    }.get._2

  }

  def main(args: Array[String]): Unit = {
    val input = Array(1, 12, 5, 111, 200, 1000, 10)
    println(maximumToys(input, 50))

  }
}

