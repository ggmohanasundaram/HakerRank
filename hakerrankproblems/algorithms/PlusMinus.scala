package hakerrankproblems.algorithms

object PlusMinus {


  def plusMinus(arr: Array[Int]) {

  val res = arr.foldLeft(0.0,0.0,0.0){(a,b) => {if(b>0)(a._1+1,a._2,a._3) else if(b<0) (a._1,a._2+1,a._3) else (a._1,a._2,a._3+1)}}
  println(res._1/arr.length)
  println(res._2/arr.length)
  println(res._3/arr.length)

  }

  def main(args: Array[String]): Unit = {

    val a =Array(-4,3,-9,0,4,1)
    plusMinus(a)

  }

}
