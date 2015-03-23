package worker_object

object Main extends App {

  val later = new Later
  later.doLater
  
  val later2 = new Later with WorkerObject
  later2.doLater
  
  val later3 = new Later
  later3.doLater
}