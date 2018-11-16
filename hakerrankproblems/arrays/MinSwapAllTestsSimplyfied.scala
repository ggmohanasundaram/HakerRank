package hakerrankproblems.arrays

object MinSwapAllTestsSimplyfied {





  def minimumSwaps(input: Array[Int]): Int = {

    def sort(input: Array[(Int)], total_swap: Int):Int = {

      val indexed_input = input.zipWithIndex
      val filtered_input = indexed_input.filter(x => x._1 != (x._2 + 1))
      if (filtered_input.length > 0) {
        var total_swap_inner = 0
        for (x <- indexed_input) {
          if (x._1 != (x._2 + 1)) {
            val temp = indexed_input(x._2)
            indexed_input(x._2) = (indexed_input(x._1 - 1)._1, x._2)
            indexed_input(x._1 - 1) = (temp._1, x._1 - 1)
            total_swap_inner += 1
          }
        }
        sort(indexed_input.map(x => x._1),total_swap+total_swap_inner)
      }
      else total_swap
    }

    sort(input,0)
  }

  def main(args: Array[String]): Unit = {
    // val res = minimumSwaps(Array(3 ,7 ,6 ,9, 1, 8, 10, 4 ,2, 5) )
    //  val res = minimumSwaps(Array(7, 1, 3, 2, 4, 5, 6), 0)
    val res = minimumSwaps(Array(4, 3, 1, 2))

    // val res = minimumSwaps(Array(1, 3, 5, 2, 4, 6, 7),0 )

    println(res)

    /* val stdin = scala.io.StdIn

     //val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

     val n = stdin.readLine.trim.toInt

     val arr = stdin.readLine.split(" ").map(_.trim.toInt)
     val res = minimumSwaps(arr, 0)

     println(res)*/

    // printWriter.close()


  }

}
