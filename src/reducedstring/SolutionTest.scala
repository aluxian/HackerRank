package reducedstring

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {

  test("reduce") {
    assertResult("abd")(Solution.reduce("aaabccddd"))
  }

}
