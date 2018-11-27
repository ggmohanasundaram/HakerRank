package hakerrankproblems.algorithms

object CamelCase {

  def camelcase(s: String): Int = {

    s.filter(_.isUpper).length+1

  }

  def main(args: Array[String]): Unit = {

   println(camelcase("saveChangesInTheEditor"))

  }

}
