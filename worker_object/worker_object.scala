package worker_object

import java.awt.EventQueue

trait WorkerObject extends Later {
  abstract override def doLater = {
     def proceed = super.doLater _
    
     val worker =  new Runnable() {
		def run() {
		  Thread.sleep(5000);
		  println("late execution")
		  proceed()
		}
	 }
     EventQueue.invokeLater(worker)
  }
}