abstract class Beverage {
  var description: String = "不明な飲み物"

  def getDescription(): String = {
    description
  }

  def cost(): Double
}
