public class User 
{
  int id;
  String name;
  static int counter=1;
  User(String name)
  {
    this.id=counter;
    this.name=name;
    counter++;
  }
  public void print()
  {
    System.out.println(id+" "+name);
  }
  
}
