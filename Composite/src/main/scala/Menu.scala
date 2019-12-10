import scala.collection.mutable.ArrayBuffer

class Menu(name: String, description: String) extends MenuComponent {
  var menuComponents: ArrayBuffer[MenuComponent] = new ArrayBuffer[MenuComponent]()

  override def add(menuComponent: MenuComponent): Unit = {
    menuComponents = menuComponents += menuComponent
  }

  override def remove(menuComponent: MenuComponent): Unit = {
    menuComponents = menuComponents -= menuComponent
  }

  override def getChild(i: Int): MenuComponent = {
    menuComponents(i)
  }

  override def getName(): String = {
    name
  }

  override def getDescription(): String = {
    description
  }

  override def print(): Unit = {
    println("\n" + getName())
    println("," + getDescription())
    println("-------------------------------")

    menuComponents.foreach(m => m.print())
  }
}
