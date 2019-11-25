class Mocha(val beverage: Beverage) extends CondimentDecorator {
  override def getDescription(): String = {
    beverage.getDescription() + "、モカ"
  }

  override def cost(): Double = {
    .20 + beverage.cost()
  }
}
