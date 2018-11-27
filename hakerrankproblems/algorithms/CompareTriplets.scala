package hakerrankproblems.algorithms

object CompareTriplets {

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

     val result = a.zip(b).foldLeft(Array(0,0)){ (a,b) => if (b._1 > b._2) Array(a(0)+1,a(1)) else if(b._1 < b._2) Array(a(0) ,a(1)+1) else a}
    result


  }

  def main(args: Array[String]): Unit = {
     val a = Array(5, 6, 7)
     val b = Array(8, 6, 3)
    val result = compareTriplets(a, b)
    println(result.mkString)
  }
}
