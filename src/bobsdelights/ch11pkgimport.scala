

package bobsdelights

object ch11pkgimport {
  def main(args: Array[String]): Unit = {
    import bobsdelights.Fruit    // 간단하게 Fruti 접근
    import bobsdelights._ // 자바의 * 대신 스칼라에서는 _ 밑줄 사용
    import bobsdelights.Fruits._
  }
}