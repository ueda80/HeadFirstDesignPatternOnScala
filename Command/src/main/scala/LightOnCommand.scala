class LightOnCommand(val light: Light) extends Command {
  override def execute(): Unit = {
    light.on()
  }

}
