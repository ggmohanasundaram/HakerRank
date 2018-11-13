package hakerrankproblems

object SuperDigit {



  def superDigitRecursion(input:Int,acc:Int):Int={
    def superDigInner(input:Int,acc:Int): Int ={

      input match {
        case 0 => acc
        case _ => superDigInner(input/10, acc+(input%10))
      }
    }
    superDigInner(input,acc)
  }

  def calculateSuperDigit(input:Int,n:Int):Int={


    val a = superDigitRecursion(input, 0)*n
    val result = a/10 match {
      case 0 => a
      case _ => superDigitRecursion(a, 0)
    }

     result
  }


  def main(args: Array[String]): Unit = {

    // println(calculateSuperDigit(scala.io.StdIn.readInt(),scala.io.StdIn.readInt()))
     println(calculateSuperDigit(148,3))

 //   val str = scala.io.StdIn.readLine()
 //   val aa = str.split(" ")
    //println(calculateSuperDigit(aa(0).toInt,aa(1).toInt ))

  }

}
