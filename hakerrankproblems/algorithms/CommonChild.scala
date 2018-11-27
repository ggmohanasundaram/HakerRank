package hakerrankproblems.algorithms

object CommonChild {


  def commonChildInner(s1: String, s2: String): Int = {
    val firstMap = s1.zipWithIndex.foldLeft(Map[Char, List[Int]]()) { (a, b) =>
      if (a.contains(b._1))
        a.updated(b._1, b._2 :: a(b._1))
      else a + (b._1 -> List(b._2))
    }

    val sortedFirstMap = firstMap.map(x => (x._1, x._2.sorted))

    val matching = s2.zipWithIndex.foldLeft(sortedFirstMap, 0,-1) {
      (a, b) =>
        if (a._1.contains(b._1) && !a._1(b._1).isEmpty) {
         // a._1.updated(b._1, a._1(b._1).tail)
          val filtered = a._1(b._1).filter(_ > a._3)
          if(filtered.length > 0)
           (a._1.updated(b._1, filtered.tail), a._2 + 1,filtered.head)
          else a

        }
        else a
    }
    matching._2

  }

  def commonChild(s1: String, s2: String): Int = {
    val first = commonChildInner(s1,s2)
    val second = commonChildInner(s2,s1)

    if (first > second)
      first
    else
      second

  }

  def main(args: Array[String]): Unit = {

    println(commonChild("ABCDEF", "FBDAMN"))


  }

}
