package hakerrankproblems.algorithms

object Encription {


  def encryption(s: String): String = {

    val filtered_string = s.filter(_ != " ")
    val length = filtered_string.length
    val squareRoot = Math.sqrt(length)
    val roundValue = Math.round(Math.sqrt(length))
    val rowInitial = if (roundValue > squareRoot) roundValue - 1 else roundValue
    val col = if (roundValue < squareRoot) roundValue + 1 else roundValue
    val row = if ((rowInitial * col) >= length) rowInitial else col

    val aa = Array.ofDim[Char](col.intValue(), row.intValue())


    def splitInneraa(s: String, aa: Array[Array[Char]], rowIndex: Int): Array[Array[Char]] = {
      s match {
        case "" => aa
        case a => {
          val subStr = a.take(col.toInt)
          subStr.foldLeft(aa, 0, rowIndex) {
            (temp, b) => {
              temp._1(temp._2)(temp._3) = b
              (temp._1, temp._2 + 1, temp._3)
            }
          }
          splitInneraa(s.drop(col.toInt), aa, rowIndex + 1)
        }

      }
    }

    //val output = splitInner(s, Array(Array.emptyCharArray))
    val output = splitInneraa(s, aa, 0)

    output.foldLeft("")((a, b) => a + b.mkString.trim + " ").trim


  }


  def main(args: Array[String]): Unit = {


    // println(encryption("chillout"))
    println(encryption("haveaniceday"))
    println(encryption("feedthedog"))
    //encryption("haveaniceday")
    //encryption("feedthedog")

  }

}
