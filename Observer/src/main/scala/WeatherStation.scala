object WeatherStation {
  def main(args: Array[String]): Unit = {
    var weatherData = new WeatherData()

    val currentDisplay = new CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(27, 65, 30.4f)
    weatherData.setMeasurements(28, 70, 29.2f)
    weatherData.setMeasurements(26, 90, 29.2f)

  }

}
