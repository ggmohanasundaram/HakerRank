package hakerrankproblems

object ReverseList {

  def f(arr:List[Int]):List[Int] = {
     arr.foldLeft(List[Int]()){
       (a,b) => b :: a
     }
  }


  def f1(arr:List[Int]):List[Int]  =
    arr match {

      case head::tail => f1(tail) ::: List(head)
      case Nil => Nil
    }




  def main(args: Array[String]): Unit = {
     println(f1(List(1,2,3,4)))
    //println(List(List(List(List(4), 3), 2), 1).flatten)
  }

}
