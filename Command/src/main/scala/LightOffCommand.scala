class LightOffCommand(val light: Light) extends Command {
  override def execute(): Unit = {
    light.off()
  }

}
