package director

trait Subject[T] {
  self : T =>
    private var observers: List[T => Unit] = Nil
    
    def subscribe(obs: T => Unit):Unit = 
	observers = obs :: observers 
    
    def unsubscribe(obs: T => Unit):Unit = 
	observers = observers filter (_ != obs)
    
    def publish = for(obs <- observers ) obs(this)
}
