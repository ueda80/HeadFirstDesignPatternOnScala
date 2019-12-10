trait MenuComponent {
  def add(menuComponent: MenuComponent): Unit = {
    throw new UnsupportedOperationException
  }

  def remove(menuComponent: MenuComponent): Unit = {
    throw new UnsupportedOperationException
  }

  def getChild(i: Int): MenuComponent = {
    throw new UnsupportedOperationException
  }

  def getName(): String = {
    throw new UnsupportedOperationException
  }

  def getDescription(): String = {
    throw new UnsupportedOperationException
  }

  def getPrice(): Double = {
    throw new UnsupportedOperationException
  }

  def isVegetarian(): Boolean = {
    throw new UnsupportedOperationException
  }

  def print(): Unit = {
    throw new UnsupportedOperationException
  }
}
