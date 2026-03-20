public class Light 
{
  boolean on;
  Light()
  {
    on=false;
  }

  public void Lighton()
  {
    on=true;
    System.out.println("Light is on");
  }

  public void LightOff()
  {
    on=false;
    System.out.println("light is off");

  }
  
}
