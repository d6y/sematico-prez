package underscore

import org.joda.time.DateTime
import org.joda.time.DateTime.now
import org.joda.time.Days.daysBetween

object RunFilterExample extends App {
  
  val subs = List(
    Subscription("Anna", true, new DateTime() plusDays 2 ),
    Subscription("Bob",  true, new DateTime() plusDays 10),
    Subscription("Carol",false,new DateTime() plusDays 2)
  )
    
  val trials : List[Subscription] = subs.filter(s => s.isTrial)  
  println(trials)
  
  def expiring(sub: Subscription) : Boolean =
    daysBetween(now, sub.expiry).getDays < 2
   
  val nagList = subs.filter(expiring)  
  println(nagList)
  
  val expiringTrials = subs.filter(expiring).filter(_.isTrial)  
  println(expiringTrials)
}