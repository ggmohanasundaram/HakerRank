package hakerrankproblems




object SuperDigitBigInt {


  def calculateSuperDigit(input:String,n:Int):Int={

    val inputBig = BigInt(input)
    val total = inputBig*n

    val aaa = total.toString().map(_.asDigit).sum
    def calculateFinal(sum: Int,acc:Int ):Int={
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
    calculateFinal(aaa,0 )
  }




  def main(args: Array[String]): Unit = {

    println(BigInt(10)/10)

   println(calculateSuperDigit("123",3))

  }

}
