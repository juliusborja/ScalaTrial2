object HelloWorld {

  def main(args: Array[String]): Unit={

    val mo = new MathOperations
    val loops = new Loops
//    println(mo.getSum(4,1))
//    println(mo.getSum(Array(1,2,3)))
//    loops.forLoopFromAList
//    loops.forLoopWithYield
//    loops.doWhileLoop
//    loops.forLoopWithMultipleRanges2()
//
//    println("For loop with filters: ")
//    loops.forLoopWithFilters

    loops.forEach
    loops.doWhileLoop

  }

}
