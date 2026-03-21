public class TrafficLight 
{
  State state;
  TrafficLight()
  {
    state=new Red();
  }

  public void setState(State state)
  {
    this.state=state;
  }

  public void show()
  {
    state.show();
  }

  public void next()
  {
    state.next(this);
  }
  
}
