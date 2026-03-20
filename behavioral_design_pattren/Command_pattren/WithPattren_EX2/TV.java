public class TV  
{
  Integer channel;
  boolean on;
  TV()
  {
    channel=null;
    on=false;
  }

  public void changeChannel(int channel)
  {
    this.channel=channel;
    System.out.println("channel has changed to "+channel);
  }

  public void on()
  {
    on=true;
    System.out.println("TV is on");
  }

  public void off()
  {
    on=false;
    System.out.println("TV is Off");
  }


  
}
