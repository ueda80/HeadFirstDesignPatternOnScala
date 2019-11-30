class StereoOnWithCDCommand(stereo: Stereo) extends Command {
  override def execute(): Unit = {
    stereo.on()
    stereo.setCd()
    stereo.setVolume(11)
  }
}
