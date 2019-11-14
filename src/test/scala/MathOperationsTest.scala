import org.scalatest.FunSuite

class MathOperationsTest extends FunSuite {

  test("testGetSum") {
    var mo = new MathOperations
    var random = scala.util.Random
    var num1 = random.nextInt(100)
    var num2 = random.nextInt(100)
    var sum = mo.getSum(num1, num2)
    assert(sum === num1+num2)
  }

}
