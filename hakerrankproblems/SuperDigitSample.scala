package hakerrankproblems

object SuperDigitSample {


  def calculateSuperDigit(input:String,n:Int):Long={

    val total = input.map(_.toLong).sum
    val aaa = List.fill(n)(total)

    def calculateFinal(sum: Long,acc:Long ):Long={
      sum/10 match
      {
        case 0 => {
          (acc+sum)/10 match {
            case 0 => acc+sum
            case _ =>  calculateFinal((acc+sum)/10,(acc+sum)%10)
          }
        }
        case _ => calculateFinal(sum/10,acc+sum%10)
      }

    }
    calculateFinal(aaa.sum,0 )


  }

  def main(args: Array[String]): Unit = {

    // println(calculateSuperDigit(scala.io.StdIn.readInt(),scala.io.StdIn.readInt()))
     println(calculateSuperDigit(scala.io.StdIn.readLine(),100000))

 //   val str = scala.io.StdIn.readLine()
 //   val aa = str.split(" ")
    //println(calculateSuperDigit(aa(0).toInt,aa(1).toInt ))

  }

}
