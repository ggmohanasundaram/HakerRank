package hakerrankproblems

object SumofOddElements {

  def f(arr:List[Int]):Int = {

    //arr.filter(_%2!= 0).foldLeft(0)(_+_)
    arr.filterNot(_%2==0).sum

  }
  def main(args: Array[String]): Unit = {
    println(f(List(3,2,4,6, 5,7,8,0,1)))
  }

}
