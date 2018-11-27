package hakerrankproblems.algorithms

object DiagonalDifference {

  // Complete the diagonalDifference function below.
  def diagonalDifference(arr: Array[Array[Int]], size : Int): Int = {

     var sum1= 0
     var sum2 = 0

    (0 to arr.length-1).map(x => {
      sum1+= arr(x)(x)
      sum2+=arr(x)(arr.length-(x+1))
    })

    Math.abs(sum1-sum2)
  }

  def main(args: Array[String]): Unit = {

    val a = Array(Array(1,2,3), Array(4,5,6 ), Array(9,8,9))
    println(diagonalDifference(a,3))


  }
}
