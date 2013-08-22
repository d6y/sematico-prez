package underscore

import org.joda.time.DateTime

case class Subscription(owner: String, isTrial: Boolean, expiry: DateTime)

object RunExample extends App {

  val nextMonth = new DateTime().plusMonths(1)

  val sub = new Subscription("Bob", isTrial = true, nextMonth)

  println(sub.owner)

  // Compiler error: reassignment to val
  // sub.owner = "Fred"

  // You get a toString
  println(sub)

  // You get equals and hashCode
  println(sub == new Subscription("Bob", isTrial = true, nextMonth))
  
  // Named parameters allow you to re-order the arguments:
  println(sub == new Subscription(
      isTrial = true, owner = "Bob", expiry = nextMonth))

}