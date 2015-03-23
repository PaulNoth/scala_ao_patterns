package cuckoo_egg

trait Cuckoo extends Nest {
  abstract override def layEgg = {
    new CuckooEgg
  }
}