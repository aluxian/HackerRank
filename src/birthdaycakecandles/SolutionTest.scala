package birthdaycakecandles

import org.scalatest.FunSuite

class SolutionTest extends FunSuite {

  test("birthdayCakeCandles") {
    assertResult(2)(Solution.birthdayCakeCandles(4, Array(3, 2, 1, 3)))
  }

}
