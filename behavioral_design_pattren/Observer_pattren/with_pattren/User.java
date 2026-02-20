public class User  implements Observer
{
  String name;
  static int counter =1;
  int id;
  public User(String  name)
  {
    this.name=name;
    this.id=counter;
    counter++;
  }

  public void update()
  {
    System.out.println(id+" "+name+" "+ "is notified");
  }

  
}
