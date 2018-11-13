package hakerrankproblems


object StringCompression {


  val count = (x: Int) => if (x > 1) x else ""

  def compression(input: String): String = {

    val endList = List("|".toList)
    val inputList  = input.toList :: endList



    inputList.flatten.foldLeft("", "", 1) {
      (a, b) => {
        if (a._1 == b.toString && b.toString !="|") {
          (a._1, a._2, a._3 + 1)
        }else if(b.toString == "|"){
          (b.toString, a._2 +count(a._3) , 1)
        }
        else {
          (b.toString, a._2 + count(a._3) + b, 1)

        }
      }

    }._2
  }


  def compression1(input: String): String ={
    val regex = "(\\w)\\1+".r
    regex.replaceAllIn(input,m => "$1" + m.toString.length)
  }

  def main(args: Array[String]): Unit = {
 println(compression(scala.io.StdIn.readLine()))
   //println(compression1("abcaaabbb"))


  }

}
