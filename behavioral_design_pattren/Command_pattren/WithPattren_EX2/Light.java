public class Light
{
  boolean on;
  Light()
  {
    this.on=false;
  }

  public void on()
  {
    on=true;
    System.out.println("light is on");
  }
  public void off()
  {
    on=false;
    System.out.println("light is off");
  }

}