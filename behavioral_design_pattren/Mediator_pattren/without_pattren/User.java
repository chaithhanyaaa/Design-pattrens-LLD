import java.util.ArrayList;

public class User 
{
  String name;
  ArrayList<User> friends=new ArrayList<>();
  User(String name)
  {
    this.name=name;
  }
  public void addFriend(User frnd)
  {
    friends.add(frnd);
  }

  public void sendMsg(String msg)
  {
    for(User user:friends)
    {
      user.receivemsg(this,msg);
    }
  }

  public void receivemsg(User sender,String msg)
  {
    System.out.println(sender.name+" sent a message to "+this.name+" "+msg);
  }


  
}
