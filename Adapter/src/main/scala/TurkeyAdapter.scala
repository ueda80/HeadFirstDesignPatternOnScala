class TurkeyAdapter(val turkey: Turkey) extends Duck {
  override def quack(): Unit = {
    turkey.gobble()
  }

  override def fly(): Unit = {
    for (i <- 0 until 5) turkey.fly()
  }
}
