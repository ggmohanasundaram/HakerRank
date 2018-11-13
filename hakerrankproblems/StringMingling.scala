package hakerrankproblems
import scala.io.StdIn.readLine


object StringMingling {

  def stringmingle(str1: String,str2: String): String = {
   str1.zip(str2).foldLeft("")((a,b) => (a+b._1+b._2))




  }

  def main(args: Array[String]): Unit = {
     println(stringmingle(readLine(),readLine()))



  }

}
