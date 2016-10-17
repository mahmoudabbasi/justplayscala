package models

/**
  * Created by Mabbasi on 10/16/2016.
  */
object samples {

  def main(args: Array[String]) {
    println(method3(method2,method1))
    println(patterncheck(10))
    println("test3: "+test3("cdef"))
    println("test4: "+ test4("afcs"))
    println("test5: "+test5("ab"))
    println("test6: "+test6("cd"))
    println(filter(List(1,5,8,2,3,7,9,4),8))
    println("factorial0: "+factorial(0))
    println("factorial1: "+factorial(1))
    println("factorial2: "+factorial(3))
    println("factorial100: "+factorial(10))

  }

  def method1(str:String):Int={
     str.length
  }
  def method2(number:Int):Int ={
     number
     }

  def method3(f1:(Int)=>Int,f2:(String)=>Int):Int ={
     f1(10)+f2("mahmoud")
  }

  def patterncheck(Number :Int):String ={
    Number match {
      case 1 => "one"
      case 2 =>"two"
      case _=>"some other number"
    }
  }


  def squart(i :Int)={
    i/2==0
  }
 val test3=(str:String) =>str+str
 def test4(str:String)=str+str

 val test5 =test3
  val test6 = test4 _


  //////////////////filter function
  def filter (xs:List[Int],thredshod:Int)={
       def process(ys:List[Int]):List[Int] = if (ys.isEmpty) ys else if (ys.head<thredshod) ys.head:: process(ys.tail) else process(ys.tail)
       process(xs)
  }
  /////////////////////////factorial
  def factorial(i:Int):BigDecimal = {
    def fact(i: Int, accumulator: BigDecimal): BigDecimal = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i,1)
  }

}
