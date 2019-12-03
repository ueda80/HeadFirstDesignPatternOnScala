class MallardDuck extends Duck {
  override def quack(): Unit = {
    println("ガーガー")
  }

  override def fly(): Unit = {
    println("飛んでいます")
  }
}
