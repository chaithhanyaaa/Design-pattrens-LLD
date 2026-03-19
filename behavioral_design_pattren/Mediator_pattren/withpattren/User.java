package withpattren;

public class User {
  String name;
  Mediator middleman;

  User(String name,Mediator middleman)
  {
    this.name=name;
    this.middleman=middleman;
  }

  public void addUser(User user)
  {
    middleman.addUser(user);
  }

  public void sendMsg(String msg)
  {
    middleman.sendMsg(msg,this);
  }

  public void receiveMsg(String msg,User sender)
  {
    System.out.println(sender.name+" sent a msg to "+this.name+" "+msg);
  }
  
}
