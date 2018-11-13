package hakerrankproblems

object ListReplication {

  def replicate(n:Int, input:List[Int])={
    input.map(x => List.fill(n)(x))
  }
  def main(args: Array[String]): Unit = {

    println(replicate(args(0).toInt,(1 to args.length-1).map(x => args(x).toInt).toList).flatten)

  }

}
