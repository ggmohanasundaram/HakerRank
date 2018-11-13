package hakerrankproblems

object FilterPositions {

  def f(arr:List[Int]) ={
  arr.zipWithIndex.filter(x => (x._2%2)!=0).map(x => x._1)
  }

  def main(args: Array[String]): Unit = {
    println(f(List(1,2,3,4,5,6)))
  }

}
