package director

class Display(val label: String) {
  def notify(s: Sensor) = 
    println(label + " " + s.label + " " + s.value )
}
