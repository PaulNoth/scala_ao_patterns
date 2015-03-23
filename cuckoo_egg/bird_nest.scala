package cuckoo_egg

class BirdNest extends Nest {
  def layEgg: Egg = {
    new BirdEgg
  }
}