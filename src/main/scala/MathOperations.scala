import scala.collection.immutable.ListSet

class MathOperations {

  def getSum(num1:Int, num2:Int) = {
    num1+num2
  }

  def getSum(nums: Array[Int]) = {
    var sum = 0
    for (num <- nums){
      sum+=num
    }
    sum
  }

  def innerFunction(): Unit ={

    def compute: Unit ={
      1+1
    }

  }

}
