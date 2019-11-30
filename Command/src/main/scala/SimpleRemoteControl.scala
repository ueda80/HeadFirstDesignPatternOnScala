class SimpleRemoteControl {
  var slot: Command = _

  def setCommand(command: Command): Unit = {
    slot = command
  }

  def buttonWasPressed(): Unit = {
    slot.execute()
  }
}
