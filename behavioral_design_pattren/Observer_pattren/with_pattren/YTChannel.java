import java.util.*;

public class YTChannel 
{
  List<Observer> li=new ArrayList<>();

  public void subscribe(Observer ob)
  {
    li.add(ob);
    System.out.println(ob+" is subscribed");
  }
 
  public void update()
  {
    for(Observer ob:li)
    {
      ob.update();
    }
  }
  
}
