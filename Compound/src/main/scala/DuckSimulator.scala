object DuckSimulator {
  def main(args: Array[String]): Unit = {
   simulate
  }

  def simulate(): Unit = {
    val mallarDuck: Quackable = new MallardDuck()
    val redheadDuck: Quackable = new RedheadDuck()
    val duckCall: Quackable = new DuckCall()
    val rubberDuck: Quackable = new RubberDuck()

    println("鴨シミュレータ")

    simulate(mallarDuck)
    simulate(redheadDuck)
    simulate(duckCall)
    simulate(rubberDuck)
  }

  def simulate(duck: Quackable): Unit ={
    duck.quack()
  }

}
