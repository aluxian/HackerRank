package minimaxsum

import scala.io.StdIn

object Solution {

  def miniMaxSum(xs: Array[Int]): (Long, Long) =  {
    val sorted = xs.sorted.map(_.toLong)
    val mini = sorted.init.sum
    val max = sorted.tail.sum
    (mini, max)
  }

  def main(args: Array[String]) {
    val xs = StdIn.readLine().split(" ").map(_.toInt)
    val (min, max) = miniMaxSum(xs)
    println(s"$min $max")
  }

}
