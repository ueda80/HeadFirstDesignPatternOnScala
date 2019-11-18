object MiniDuckSimulator {
  def main(args: Array[String]) {
    println("--- MallarDuck ---")
    val mallard = new MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    println("--- ModelDuck ---")
    var model = new ModelDuck()
    model.performFly()
    model.setFlyBehavior(new FlyRocketPowered)
    model.performFly()
  }
}
