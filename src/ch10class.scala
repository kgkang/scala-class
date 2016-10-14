

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = {
    // b = 1
    sum += b
  }
  def checksum():Int = {
    return ~(sum&0xFF)+1
  }
}

object ch10class {
  def main(args: Array[String]): Unit = {
    val acc1 = new ChecksumAccumulator
    // acc1.sum = 3 // 에러 발생 
    acc1.add(10)
    println(acc1.checksum()) // -10
  }
}