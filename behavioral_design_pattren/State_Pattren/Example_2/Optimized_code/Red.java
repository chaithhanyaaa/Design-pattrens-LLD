public class Red implements State
{

  @Override
  public void next(TrafficLight tf) 
  {
    tf.setState(new Green());

  }

  @Override
  public void show() 
  {
    System.out.println("Stop");
  }
  
  
}
