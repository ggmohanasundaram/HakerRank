package hakerrankproblems.algorithms

object StringPermutation {

  def subStrings(list:List[String]): Unit ={



  }

  def main(args: Array[String]): Unit = {
    val a = "abbbc"
/*   println(a.toSet[Char].subsets.map(_.toList.mkString).toList)
    val strings = (1 to a.length flatMap (x => a.combinations(x))) map (x => x.mkString(""))
    println(strings.toList)*/

    println(a.combinations(3).toList)
  }

}
