class Stereo(val name: String) {
  def on(): Unit = {
    println(name + " " + "ステレオの電源が入っています")
  }

  def off(): Unit = {
    println(name + " " + "ステレオの電源が切れています")
  }

  def setCd(): Unit = {
    println(name + " " + "CD入力に設定されています")
  }

  def setDvd(): Unit = {
    println(name + " " + "DVD入力に設定されています")
  }

  def setRadio(): Unit = {
    println(name + " " + "Radioに設定されています")
  }

  def setVolume(vol: Int): Unit = {
    println(name + " " + "ボリュームを" + vol.toString() + "に設定されています")
  }
}
