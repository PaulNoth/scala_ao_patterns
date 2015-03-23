package director

class Sensor(val label: String){
  var value:Double = _
  
  def changeValue(v: Double) = 
    value = v
}