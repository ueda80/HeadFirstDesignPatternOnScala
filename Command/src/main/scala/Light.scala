class Light(val name: String) {
  def on(): Unit = {
    println(name + " " + "照明がついています")
  }

  def off(): Unit = {
    println(name + " " + "照明が消えています")
  }
}
