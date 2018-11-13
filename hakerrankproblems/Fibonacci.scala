package hakerrankproblems
import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Fibonacci {

  def fibonacci(x: Int): Int = {

    x match {
      case 0 => 0
      case 1 => 1
      case 2 => 1
      case _ =>  fibonacci(x-1) + fibonacci(x-2)
    }
  }

  def fib(x:Int):Int={
    x <= 1 match {
      case true => x
      case false => (1 to x-1).foldLeft((0, 1)) {
        case ((a,b), i) => (b, a+b)
      }._1
    }

  }

  def fibonacci1(x: Int): Int = {
    val initialValue = 0 // f(1) == 0
    val initNext = 1 // f(2) == 1
    val initialIndex = 1 // 1 < N <= 40
    @tailrec
    def iter(cur: Int, next: Int, acc: Int): Int = {
      if (acc == x) cur
      else iter(next, cur + next, acc + 1)
    }
    iter(initialValue, initNext, initialIndex)
  }

  def main(args: Array[String]) {
    /** This will handle the input and output **/
    println(fibonacci1(4))
  //  println(fibonacci(4))


  }
}
