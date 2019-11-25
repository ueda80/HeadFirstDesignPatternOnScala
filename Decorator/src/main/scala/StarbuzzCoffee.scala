object StarbuzzCoffee {
  def main(args: Array[String]): Unit = {
    // エスプレッソ----
    val beverage = new Espresso()
    println(beverage.getDescription() + " $" + beverage.cost())

    // ダークローストコーヒー---
    var beverage2: Beverage = new DarkRoast()
    beverage2 = new Mocha(beverage2)
    beverage2 = new Mocha(beverage2)
    beverage2 = new Whip(beverage2)
    println(beverage2.getDescription() + " $" + beverage2.cost())

    // ハウスブレンド ---
    var beverage3: Beverage = new HouseBlend()
    beverage3 = new Soy(beverage3)
    beverage3 = new Mocha(beverage3)
    beverage3 = new Whip(beverage3)
    println(beverage3.getDescription() + " $" + beverage3.cost())

  }

}
