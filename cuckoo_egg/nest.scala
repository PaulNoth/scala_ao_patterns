package cuckoo_egg

trait Nest {
  var eggs: List[Egg] = Nil
  
  def newEgg: Unit = {
    var egg = layEgg
    eggs = egg :: eggs
    egg.hatch
  }
  
  def layEgg: Egg
}