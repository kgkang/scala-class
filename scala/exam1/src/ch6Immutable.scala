

object ch6Immutable extends App {
//  import scala.collection.immutable.Map 
// 기본이 변경불가능한 맵이기 때문에 import는 선택사항 
  
  val romanNumeral = Map(
      1->"I",2->"II",3->"III",4->"IV",5->"V")
  println(romanNumeral)
}