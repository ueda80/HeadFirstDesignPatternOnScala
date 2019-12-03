class WildTurkey extends Turkey {
  override def gobble(): Unit = {
    println("ゴロゴロ")
  }

  override def fly(): Unit = {
    println("短い距離を飛んでいます")
  }

}
