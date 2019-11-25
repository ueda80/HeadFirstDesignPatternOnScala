class Soy(val beverage: Beverage) extends CondimentDecorator {
  override def getDescription(): String = {
    beverage.getDescription() + "、豆乳"
  }

  override def cost(): Double = {
    .15 + beverage.cost()
  }
}
