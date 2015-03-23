package director

trait SuperSensor extends Sensor with Subject[Sensor] {
  override def changeValue(v: Double) = {
    super.changeValue(v)
    publish
  }
}