trait Observer {
  def update(temp: Float, humidity: Float, pressure: Float): Unit
}
