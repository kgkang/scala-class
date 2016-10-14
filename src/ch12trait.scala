
trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am")
  }
}

class Animal
class Frog extends Animal with Philosophical {
  override def toString = "green"
}

object ch12trait {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize() // I ...
  }
}