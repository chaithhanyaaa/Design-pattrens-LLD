public class Main 
{
  public static void main(String[] args) {
    Tv tv=new Tv();
    Light light=new Light();
    AC ac=new AC();

    SmartRemote remote=new SmartRemote();
    remote.setButton("TV_ON", ()->tv.TVon());
    remote.setButton("TV_OFF",()->tv.TVOff());
    remote.setButton("AC_ON",()->ac.ACon());

    remote.press("TV_ON");
    remote.press("TV_OFF");
  }
  
}
