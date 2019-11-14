import scala.collection.immutable.ListSet
import scala.util.Try
import scala.util.control.Breaks
import scala.util.control.Breaks._

object Loops {

  def numberOne = {
    1
  }

  val THIS_IS_A_CONSTANT: Int = 5;

  def returnDifferentDataTypes = {
    val x = scala.util.Random.nextInt(100)
    if(x>50){
      "hello"
    }else{
      25
    }
  }

  def matchCaseSample ={
    val x = scala.util.Random.nextInt(100)
    x match{
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
    }
  }

  def forLoopFromRange(): Int = {
    var sum = 0
    for(i <- Range(0,100)){
      sum+=i
    }
    sum
  }

  def forLoopFromAList {
    println("Start Loop for Items")
    val list = ListSet(1,2,4,"asd")
    for(item <- list){
      println(item)
    }
    println("End Loop for Items")
  }

  def forLoopWithYield {
    val list = ListSet(1,2,4,"asd",100,65,6,"text")
    var item = null
    var output = for {item <- list
         if Try(("" + item).toInt).isSuccess

         }yield item
    println(output)
  }

  def forLoopWithUntilKeyword: Unit ={
    for (i <- 7 until 100){
      println(i)
    }
  }

  def forLoopWithToKeyword: Unit ={
    for (i <- 7.to(100)){
      println(i)
    }
  }

  def forLoopWithMultipleRanges(): Unit = {
    for (i<-Range(1,10); j<-Range(4,6)){
      println("i: " + i + "\tj: " + j + "\nsum:" + (i+j))
    }
  }

  def forLoopWithMultipleRanges2(): Unit = {
    val list = ListSet(1,2,4,"asd",100,65,6,"text")
    for (i<-Range(1,10); item<-list){
      println("i: " + i + "\tj: " + item)
    }
  }

  def forLoopWithFilters: Unit ={
    for (i<-Range(1,10); j<-Range(4,20); if i%2==0; if j%3==0){
      println("i: " + i + "\tj: " + j + "\nsum:" + (i+j))
    }
  }


  def forEach {
    var list = List(100,200,300)
    list foreach println
    list.foreach(num => someMethod(num))
  }

  def someMethod(num:Int): Unit = {
    println(num-1)
  }

  def whileLoop: Unit = {
    var x = 100.0;
    while(x>2){
      println(x)
      x = scala.math.floor(scala.math.sqrt(x))
    }
  }

  def doWhileLoop: Unit = {
    var x = 100.0;
    do{
      println(x)
      x = scala.math.floor(scala.math.sqrt(x))
    }while(x>101)
  }

  def forLoopWithBreak: Unit ={
    breakable{
      for(i <- Range(4,20)){
        println(i)
        if(i>6)
          break
      }
    }
  }

  def whileLoopWithBreak: Unit ={
    breakable{
      while(true){
        if(true){
          break
        }
      }
    }
  }

}
