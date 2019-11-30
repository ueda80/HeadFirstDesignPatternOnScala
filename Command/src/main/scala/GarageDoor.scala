class GarageDoor(val name: String) {
  def up(): Unit = {
    println("ガレージのドアを開けています")
  }

  def down(): Unit = {
    println("ガレージのドアを閉めています")
  }

  def stop(): Unit = {
    println("ガレージのドア開閉を止めます")
  }

  def lightOn(): Unit = {
    println("ガレージのライトを点灯します")
  }

  def lightOff(): Unit = {
    println("ガレージのライトを消します")
  }
}
