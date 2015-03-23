package director

object Main extends App {
  val d1 = new Display("d1")
  val d2 = new Display("d2")
  val s1 = new Sensor("s1") with SuperSensor
  val s2 = new Sensor("s2")
  s1.subscribe(d1.notify)
  s1.subscribe(d2.notify)
  s1.changeValue(1.0)
  s2.changeValue(2.0)
}