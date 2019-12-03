object DuckTestDrive {
  def main(args: Array[String]): Unit = {
    val duck = new MallardDuck()

    val turkey = new WildTurkey()
    val turkeyAdapter = new TurkeyAdapter(turkey)

    println("Turkeyの出力------")
    turkey.gobble()
    turkey.fly()

    println("\nDuckの出力--------")
    testDuck(duck)

    println("\nTurkeyAdapterの出力------")
    testDuck(turkeyAdapter)
  }

  def testDuck(duck: Duck): Unit = {
    duck.quack()
    duck.fly()
  }

}
