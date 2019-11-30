class GarageDoorOpenCommand(val garageDoor: GarageDoor) extends Command {
  override def execute(): Unit = {
    garageDoor.up()
  }
}
