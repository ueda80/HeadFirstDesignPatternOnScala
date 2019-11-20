final class CurrentConditionsDisplay(wData: Subject)
    extends Observer
    with DisplayElement {

  var temperature: Float = _
  var humidity: Float = _
  var weatherData: Subject = wData
  weatherData.registerObserver(this)

  override def update(temp: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temp
    this.humidity = humidity
    display()
  }

  override def display(): Unit = {
    println(
      "現在の気象状況：温度" + temperature.toString + "度　湿度" + humidity.toString + "%"
    )
  }
}
