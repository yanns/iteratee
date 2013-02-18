import concurrent.duration.Duration
import concurrent.{Await, Future}
import play.api.libs.iteratee.{Iteratee, Enumerator}

object Hello {

  def main(args: Array[String]) {
    println("hello iteratees")

    val enumerateUsers: Enumerator[String] = {
      Enumerator("Guillaume", "Sadek", "Peter", "Erwan")
    }

    val consume = Iteratee.consume[String]()

    val eventuallyResult: Future[String] = enumerateUsers run consume

    val result = Await.result(eventuallyResult, Duration.Inf)
    println(result)
  }
}
