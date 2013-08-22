package underscore

object PaymentExample extends App {

  case class Sub(name: String, cc: Option[String])
  
  val subs = List(
	Sub("Anna", None),
	Sub("Bob",  Some("1234-5678-9123-4567")),
	Sub("Carol",Some("9876-5432-1234-5678"))

  )

  // Type alias
  type Result = String

  def bill(cc: String) : Result = {
    println(s"Charging ${cc} on ${Thread.currentThread}")
    Thread.sleep(2000L)
    "OK"
  }
  
  val results = subs.flatMap(s => s.cc).map(bill)
  
  println(results)
  
  // .par gives us a parallel version of the collection:
  val fasterResults = for {
   sub <- subs.par
   cc <- sub.cc
  } yield bill(cc)
  
  println(fasterResults)  

}