object Methods {

  def simpleMethod{
    1
  }

  def simpleMethodWithParenthesisNoParameter(){
    1
  }

  def simpleMethodWithoutAReturnValue: Unit ={
    println(1)
  }

  def simpleMethodWithParameter(str: String): Unit ={
    println("Hello " + str)
  }

  def simpleMethodWithMultipleParameters(num1: Int, num2: Int): Unit ={
    println(num1+num2)
  }

  def simpleMethodWithReturnType(): Int = {
    1
  }

  def curriedMethod(x: Int)(y: Int): Unit ={
    x*y;
  }

  def methodThatAppliesCurriedMethod(): Unit ={
    val incompleteValue = curriedMethod(5) _
    val completeValue = incompleteValue(7)
    println(completeValue)

    val someList = List(1,2,3)
    for(item <- someList){
      println(incompleteValue(item))
    }

  }

  def someMethod: Unit ={
    var x => {1}
  }

}
