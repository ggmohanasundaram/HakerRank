package hakerrankproblems

object ScalaStringOperations {



  def main(args: Array[String]): Unit = {

    val a ="aaaaabc".toList
    val bbb = a.groupBy(_.toChar)

    val charLength = bbb map {case (key, value) => value.length}

    println(charLength)

    val countLength = charLength.groupBy(_.toInt)

    println(countLength)

    val countList = countLength.keys.toList
    val valueCount = countLength.values.toList
    if(countList.length >= 3){
      println("NO")
    }
    else if (countList.length == 1){
      println("YES")
    }
    else if ( (valueCount(0).size == 1 || valueCount(1).size ==1 ) && ((countList(0) == 1 || countList(1) == 1) || Math.abs(countList(0) - countList(1)) == 0)){
      println("YES")
    }
    else {
      println("No")
    }


  }

}
