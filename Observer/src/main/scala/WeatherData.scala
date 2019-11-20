final class WeatherData extends Subject {
  var observers: Set[Observer] = Set()
  var temperature: Float = _
  var humidity: Float = _
  var pressure: Float = _

  override def registerObserver(o: Observer): Unit = {
    observers += o
  }

  override def removeObserver(o: Observer): Unit = {
    observers -= o
  }

  override def notifyObservers(): Unit = {
    observers.foreach(o => o.update(temperature, humidity, pressure))
  }

  def measurementsChanged(): Unit = {
    notifyObservers()
  }

  def setMeasurements(t: Float, h: Float, p: Float): Unit = {
    temperature = t
    humidity = h
    pressure = p
    measurementsChanged()
  }
}
