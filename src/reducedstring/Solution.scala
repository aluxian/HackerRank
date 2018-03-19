package reducedstring

import scala.io.StdIn

object Solution {

  def posOfDupe(as: Array[Char]): Option[Int] = {
    for (i <- 0 until (as.length - 1)) {
      if (as(i) == as(i + 1)) {
        return Some(i)
      }
    }

    None
  }

  def reduce(input: String): String = {
    var s = input
    var pos = posOfDupe(s.toCharArray)

    while (pos.isDefined) {
      s = s.substring(0, pos.get) + s.substring(pos.get + 2)
      pos = posOfDupe(s.toCharArray)
    }

    if (s.isEmpty) {
      s = "Empty String"
    }

    s
  }

  def main(args: Array[String]): Unit = println(reduce(StdIn.readLine()))

}
