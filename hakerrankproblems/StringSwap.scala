package hakerrankproblems

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.io.StdIn._


object StringSwap {


  def stringSwp(str1: String): String = {
    @tailrec
    def stringSwapInner(first: Char, second: Char, remainder: String, acc: String): String = {
      if (first == null || second == null) acc
      else if (remainder == "") {
        acc + second + first
      }
      else {
        stringSwapInner(remainder.head, remainder.tail.head, remainder.tail.tail, acc + second + first)
      }
    }

    stringSwapInner(str1.head, str1.tail.head, str1.tail.tail, "")
  }

  def main(args: Array[String]): Unit = {

    val a = "abcdef"
    val str = a.sliding(2,2).toList.map(_.reverse).mkString
    println(str)


   /* val numberOfInput = readInt()
    var input =new  ListBuffer[String]()

    for (x <- (1 to numberOfInput)) {
      input += readLine()

    }

    input.map(x => println(stringSwp(x)))*/



  }

}
