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
    println("factorial100: "+factorial(5))

    val hellos =saySomeThings("hello")
    println(hellos("Al"))

     val languagestatus = greeting("english")
    println(languagestatus("mahmoud"))
    println(strToInt("123"))
    println((new Container[String]).addIt("123"))
    println((new Container1[String]).addIt("123"))


    var user1 = userRepository.findById(1)
    if (user1.isDefined) {
      println(user1.get)
      println(user1.get.firstName)
      println(user1.get.gender.getOrElse("not specified1"))
    }
    user1.get.gender match {
      case Some(gender) => println(gender)
      case None => println("error not specified1")
    }

    user1= userRepository.findById(2)
    if (user1.isDefined) {
      println(user1.get.gender.getOrElse("not specified2"))
    }
     user1.get.gender match {
       case Some(gender) => println(gender)
       case None => println("error not specified2")
     }

    userRepository.findById(2).foreach(user =>println(user.firstName))
    userRepository.findByAll.foreach(user =>println(user.firstName))

    val age=userRepository.findById(1).map(_.age)
    println(age)

    val gender =userRepository.findById(1).map(_.gender)
    println(gender)



    val gender1 = userRepository.findById(1).flatMap(_.gender) // gender is Some("male")
    val gender2 = userRepository.findById(2).flatMap(_.gender) // gender is None
    val gender3 = userRepository.findById(3).flatMap(_.gender)

    println(gender1)
    println(gender2)
    println(gender3)

    val names: List[List[String]] =
    List(List("John", "Johanna", "Daniel"), List(), List("Doe", "Westheide"))
    println(names.map(_.map(_.toUpperCase)))
    println(names.flatMap(_.map(_.toUpperCase)))

    val filter1 =userRepository.findById(1).filter(_.age>30)
    val filter2 =userRepository.findById(1).filter(_.age>40)
    val filter3 =userRepository.findById(1).filter(_.age<30)
    val filter4 =userRepository.findById(2).filter(_.age>30)
    val filter5 =userRepository.findById(3).filter(_.age>30)
    println(filter1)
    println(filter2)
    println(filter3)
    println(filter4)
    println(filter5)

    for {
      user <- userRepository.findById(1)
      gender6 <- user.gender
    } yield println(gender6)

    for {
      user <- userRepository.findByAll
      gender7 <- user.gender
    } yield println(gender7)

    for {
      User(_,_,_,_,Some(gender8)) <- userRepository.findByAll
    } yield println(gender8)


    val resourceFromConfigDir: Option[Resource] = None
    val resourceFromClasspath: Option[Resource] = Some(Resource("I was found on the classpath"))
    val resource = resourceFromConfigDir orElse resourceFromClasspath
    println(resource)


    val resourceFromConfigDir1: Option[Resource] =Some(Resource("hello"))
    val resourceFromClasspath1: Option[Resource] = Some(Resource("I was found"))
    val resource1 = resourceFromConfigDir1 orElse resourceFromClasspath1
    println(resource1)


    /////////////tuples
    val student = ("Andrew", 1201)
    println("tuples:"+student.getClass)



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
  def factorial(i:Int):Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i,1)
  }

  ///////////////////////////////////////

def saySomeThings(perfix:String)=(s:String) =>{
  perfix +"::::"+ s
}

def greeting(language:String) =(s:String) =>
    {
      language match {
        case "english" =>"hello ::: " +s
        case "spanish" =>"buenous dias ::: " + s
      }
    }

  implicit def strToInt(x:String) = x.toInt


  class Container[A<% Int] { def addIt(x:A)=123+x}

  class Container1[A<% String] { def addIt(x:A)="123"+x}


  case class User( id:Int , firstName:String , lastName:String , age:Int , gender:Option[String] )
  object userRepository {
    private val users=Map(1->User(1,"John","Doe",32,Some("male")),
      2->User(2,"Johanna","Doe",30,None))
    def findById(id:Int):Option[User]=users.get(id)
    def findByAll=users.values
  }


  case class Resource(content: String)


 /////////////////////////////////////////////////





}
