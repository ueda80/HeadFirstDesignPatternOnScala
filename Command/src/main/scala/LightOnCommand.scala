class LightOnCommand(light: Light) extends Command {
  override def execute(): Unit = {
    light.on()
  }

}
