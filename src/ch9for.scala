

object ch9for extends App {
  val currFiles = (new java.io.File(".")).listFiles()
  for (file <- currFiles)
    println(file)
    
  for (file <- currFiles if file.getName.endsWith(".scala"))
    println(file)
    
  for (file <- currFiles)
    if (file.getName.endsWith(".scala"))
      println(file)
  
  for (file <- currFiles
       if file.isFile // if를 추
       if file.getName.endsWith(".scala")
       )
    println(file)
    
  for (i <- 1 to 4)
    println("Iteration=>"+1)
}