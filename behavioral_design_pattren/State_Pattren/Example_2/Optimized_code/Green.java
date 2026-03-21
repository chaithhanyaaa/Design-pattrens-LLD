public class Green implements State
{

  @Override
  public void next(TrafficLight tf) 
  {
    tf.setState(new Yellow());
   
  }

  @Override
  public void show() 
  {
    System.out.println("Go");  
  }
  
}
