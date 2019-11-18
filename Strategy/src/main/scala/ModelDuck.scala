class ModelDuck(flyBehavior: FlyBehavior = new FlyNoWay, quackBehavior: QuackBehavior = new Quack) extends Duck(flyBehavior, quackBehavior) {
  override def display(): Unit = {
    println("模型の鴨です")
  }
}
