package hakerrankproblems.algorithms

object FindDigits {

  def findDigits(n: Int): Int = {

    def findDigitInner(n: Int, digit: Int, count: Int): Int = {
      digit match {
        case 0 => count
        case _ => {
          if ((digit%10)!=0 &&  n % (digit % 10) == 0) {
            findDigitInner(n, digit / 10, count + 1)
          }
          else findDigitInner(n, digit / 10, count)
        }
      }
    }

    findDigitInner(n, n, 0)
  }

  def main(args: Array[String]): Unit = {

    println(findDigits(1012))

  }
}
