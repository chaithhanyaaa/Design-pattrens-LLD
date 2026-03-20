public class Main 
{
  public static void main(String[] args) {
    Light light=new Light();
    TV tv=new TV();
    LightOn on=new LightOn(light);
    TVOn tvon=new TVOn(tv);
    Remote remote=new Remote(on);
    remote.click();
    remote.setCommand(tvon);
    remote.click();
    
  }
  
}
