class MallardDuck(flyBehavior: FlyBehavior = new FlyWithWings(), quackBehavior: QuackBehavior = new Quack()) extends Duck(flyBehavior, quackBehavior) {
  override def display(): Unit = {
    println("本物のマガモです。")
  }
}
