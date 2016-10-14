

object ch9match extends App {
  val firstArg = if(args.length>0) args(0) else ""
    
  // 부수효과가 있는 match
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?") // 모든 것을 _로 표
  }
  
  println(firstArg)
  
  // 부수효과 없는 match문 
  val friends = 
    firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
  
  println(friends)
}