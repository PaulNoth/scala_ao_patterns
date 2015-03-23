package cuckoo_egg

object Main extends App {
  val nest = new BirdNest
  nest.newEgg
  
  val cuckoo = new BirdNest with Cuckoo
  cuckoo.newEgg
  
}