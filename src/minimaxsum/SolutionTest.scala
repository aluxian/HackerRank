package minimaxsum

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {

  test("miniMaxSum") {
    assertResult((10, 14))(Solution.miniMaxSum((1 to 5).toArray))
  }

}
