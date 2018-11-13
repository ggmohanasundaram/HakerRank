package hakerrankproblems

import java.io.PrintWriter

object ValidString {

  // Complete the isValid function below.
  def isValid(s: String): String = {
    val bbb = s.groupBy(_.toChar)

    val charLength = bbb map {case (key, value) => value.length}

    val countLength = charLength.groupBy(_.toInt)

    println(countLength)

    val countList = countLength.keys.toList
    val valueCount = countLength.values.toList
    if(countList.length > 3){
      return  "NO"
    }
    if (countList.length == 1){
      return  "YES"
    //  println("YES")
    }
    else if ( (valueCount(0).size == 1 || valueCount(1).size ==1 ) && ((countList(0) == 1 || countList(1) == 1) || Math.abs(countList(0) - countList(1)) == 0)){
      println("YES")
      return  "YES"
    }
    else {
      println("No")
      return  "No"
    }

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = stdin.readLine

    val result = isValid(s)

    printWriter.println(result)

    printWriter.close()
  }
}
