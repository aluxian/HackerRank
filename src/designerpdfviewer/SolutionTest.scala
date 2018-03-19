package designerpdfviewer

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {

  test("designerPdfViewer") {
    val h = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7".split(" ").map(_.toInt)
    val word = "zaba"
    assertResult(28)(Solution.designerPdfViewer(h, word))
  }

}
