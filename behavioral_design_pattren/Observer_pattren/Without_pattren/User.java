public class User{
  String name;
  int id;
  public User(String name,int id)
  {
    this.name=name;
    this.id=id;
  }

  public void sendMessage()
  {
    System.out.println(name +"is notified");
  }
}