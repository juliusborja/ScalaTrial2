object HelloWorld {

  def main(args: Array[String]): Unit={

    val mo = new MathOperations
    val loops = new Loops
    val errorHandling = new ErrorHandling
    val methods = new Methods

//    println(mo.getSum(4,1))
//    println(mo.getSum(Array(1,2,3)))
//    loops.forLoopFromAList
//    loops.forLoopWithYield
//    loops.doWhileLoop
//    loops.forLoopWithMultipleRanges2()
//
//    println("For loop with filters: ")
//    loops.forLoopWithFilters

//    loops.forEach
//    loops.doWhileLoop

    errorHandling.simpleTryCatchBlock


    methods.twoParameters _ tupled methods.methodThatReturnsTwoValuesInATuple()


    println("End of execution")

    println(curriedFunction(1)(2))

    val incompleteMethodValue = curriedFunction(20) _
    val finalVal = incompleteMethodValue(3)

    val list = List(1,2,3)
    for(item <- list){
      println(incompleteMethodValue(item))
    }

  }

  def curriedFunction(x: Int)(y: Int): Int = { x + y }


}
