package hakerrankproblems.sorting

object NearestNumbers {

  // Complete the closestNumbers function below.
  def closestNumbersOld(arr: Array[Int]): Array[Int] = {
    //val pairs = (1 to arr.length flatMap (x => arr.combinations(x))) map (x => x.mkString(""))

    val differences = arr.sorted.combinations(2).toList
    val res = differences.foldLeft(Map[Int, List[(Int, Int)]]()) { (a, b) =>
      val i = Math.abs(b(0) - b(1))
      if (a.contains(i)) a.updated(i, (b(0), b(1)) :: a(i))
      else a + (i -> List((b(0), b(1))))

    }
    val sorted = res.keys.toArray.sorted
    val out = res.get(sorted(0)).get.flatMap(x => List(x._1, x._2))
    out.toArray.sorted


    //  Array(0)
  }


  def closestNumbers(arr: Array[Int]): Array[Int] = {
    val sorted = arr.sorted.toList

    def inner(a: List[Int], pair: (Int, List[Int])):(Int, List[Int]) = {

      a match {
        case first :: second :: tail => {
          val i = Math.abs(first - second)
          if (pair._1==0) inner(second::tail, (i, List(first,second)))
          else if(i < pair._1) inner(second::tail, (i, List(first,second)))
          else if(i == pair._1) inner(second::tail, (i, first::second::pair._2))
          else inner(second::tail, pair)
        }
        case first::Nil => pair
      }

    }
    val res = inner(sorted,(0,List[Int]()))


    res._2.sorted.toArray


    //  Array(0)
  }


  def main(args: Array[String]): Unit = {
    //  val a = Array(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854)
     val a = Array(5,2,3,4,1)
    //val a = Array(-5, 15, 25, 71, 63)
    println(closestNumbers(a).mkString(" "))
  }
}
