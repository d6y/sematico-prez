
object hello {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  import underscore.PaymentExample._
  
  val s = Sub("Fred", Some("1234"))               //> s  : underscore.PaymentExample.Sub = Sub(Fred,Some(1234))
  
  s match {
    case Sub(n, Some(c)) => c
    case otherwise => "No credit card number"
  }                                               //> res0: String = 1234
  


}