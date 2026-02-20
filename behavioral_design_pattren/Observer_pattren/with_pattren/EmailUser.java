public class EmailUser implements Observer{
  String email,name;
  int id;
  public EmailUser(String email,String name)
  {
    this.name=name;
    this.email=email;
    id=User.counter++;
  }

 

  public void update()
  {
    System.out.println("notification is sent to "+email);
  }
  
}
