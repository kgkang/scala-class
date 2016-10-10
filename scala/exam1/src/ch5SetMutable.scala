

object testSetMutable extends App {
  import scala.collection.mutable.Set
  val movieSet = Set("인디펜더스데이","컨저링2")
  movieSet += "아가씨"
  println(movieSet)
}