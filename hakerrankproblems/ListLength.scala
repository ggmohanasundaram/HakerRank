package hakerrankproblems

object ListLength {


  def f(arr:List[Int]):Int = {
    def len(arr: List[Int], count: Int):Int = {
      arr match {
        case  Nil => count
        case head::tail => len(tail,count+1)

      }
    }
    len(arr,0)
  }

  def f1(arr:List[Int]):Int = {
    arr.foldLeft(0)((acc,ele) => acc+1)
  }

  def main(args: Array[String]): Unit = {

    println(f1(List(1,2,3,4)))

  }

}
