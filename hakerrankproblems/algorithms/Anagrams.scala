package hakerrankproblems.algorithms

object Anagrams {

  def sherlockAndAnagrams(s: String): Int = {

    val subString = s.inits.flatMap(_.tails.toList.init).toList

    val countMap = subString.foldLeft(Map[String, Int]()) { (a, b) => {

      val key = b.toCharArray.sorted.mkString
      if (a.contains(key)) {

        a.updated(key, a(key) + 1)

      } else a.updated(key, 0)
    }
    }

    countMap.values.map(x => (x * (x + 1)) / 2).sum
  }

  def main(args: Array[String]): Unit = {
    val input = "kkkk"
    //  val input = "ifailuhkqq"
    println(sherlockAndAnagrams(input))

    // println("adwfywxccqdx".toCharArray.sorted.mkString)


  }

}
