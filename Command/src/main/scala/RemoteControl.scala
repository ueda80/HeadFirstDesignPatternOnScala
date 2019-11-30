class RemoteControl {
  val onCommands = new Array[Command](7)
  val offCommands = new Array[Command](7)

  val noCommand = new NoCommand()
  (0 to 6).foreach { i =>
    onCommands.update(i, noCommand)
    offCommands.update(i, noCommand)
  }

  def setCommand(slot: Int, onCommand: Command, offCommand: Command): Unit = {
    onCommands.update(slot, onCommand)
    offCommands.update(slot, offCommand)
  }

  def onButtonWasPushed(slot: Int): Unit = {
    onCommands(slot).execute()
  }

  def offButtonWasPushed(slot: Int): Unit = {
    offCommands(slot).execute()
  }

  override def toString(): String = {
    var str = ""
    (0 to 6).foreach { i =>
      str + " [スロット" + i.toString + "] " + onCommands(i)
        .getClass()
        .getName() + " " + offCommands(i).getClass().getName() + "\n"
    }

    str
  }
}
