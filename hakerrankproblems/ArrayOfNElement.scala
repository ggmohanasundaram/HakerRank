package hakerrankproblems

object ArrayOfNElement {

  def f(num:Int) : List[Int] = {
    // val list = (1 to num).map(x => x).toList
    val list =List.fill(1)(num)

    print(list + "\n")
    return list
  }

  def main(args: Array[String]): Unit = {

  }

}
