public class Yellow implements State {
  public void next(TrafficLight tf)
  {
    tf.setState(new Red());

  }
  public void show()
  {
    System.out.println("slow");

  }
  
}
