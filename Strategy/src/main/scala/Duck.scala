abstract class Duck(var flyBehavior: FlyBehavior,
                    var quackBehavior: QuackBehavior) {
  def display(): Unit

  def performFly(): Unit = {
    flyBehavior.fly()
  }

  def performQuack(): Unit = {
    quackBehavior.quack()
  }

  def setFlyBehavior(fb: FlyBehavior): Unit = {
    flyBehavior = fb
  }

  def setQuackBehavior(qb: QuackBehavior): Unit = {
    quackBehavior = qb
  }

  def swim(): Unit = {
    println("すべての鴨は浮かびます。おとりの鴨でも！")
  }
}
