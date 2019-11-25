class Whip(val beverage: Beverage) extends CondimentDecorator {
  override def getDescription(): String = {
    beverage.getDescription() + "、ホイップ"
  }

  override def cost(): Double = {
    .10 + beverage.cost()
  }
}
