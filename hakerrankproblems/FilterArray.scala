package hakerrankproblems

object FilterArray {
  def f(n:Int, input:List[Int])={
    input.filter(x => x!=n)
  }
  def main(args: Array[String]): Unit = {

    println(f(args(0).toInt,(1 to args.length-1).map(x => args(x).toInt).toList) )

  }

}
