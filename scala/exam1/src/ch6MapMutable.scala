

object ch6MapMutable {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find bif X on ground")
    treasureMap += (3 -> "Dig")
    treasureMap(4) = "Happy??" // treasureMap += (4 -> "Happy??") 와 같음 
    println(treasureMap)
    println(treasureMap(2))
    
  }
}