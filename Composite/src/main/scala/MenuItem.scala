class MenuItem(name: String, description: String, vegetarian: Boolean, price: Double) extends MenuComponent {

  override def getName(): String = {
    name
  }

  override def getDescription(): String = {
    description
  }

  override def getPrice(): Double = {
    price
  }

  override def isVegetarian(): Boolean = {
    vegetarian
  }

  override def print(): Unit = {
    println(" " + getName())

    if (isVegetarian()){
      println("(v)")
    }

    println("," + getPrice())
    println(" -- " + getDescription())
  }
}
