public class Premiumuser  implements Observer 
{
  String name;
  int id;
  public Premiumuser(String name)
  {
    this.name=name;
    this.id=User.counter;
    User.counter++;
  }

  public void update()
  {
    System.out.println(id+" "+name+" is updated with premium alter");
  }
  
  
}
