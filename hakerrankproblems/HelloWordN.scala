package hakerrankproblems

object HelloWordN {

  def sample(n:Int): Unit ={

    (1 to n).map(x => println("Hello World"))

  }
  def main(args: Array[String]): Unit = {
    sample(-1)

  }
}
