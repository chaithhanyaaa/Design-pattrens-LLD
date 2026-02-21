import java.util.ArrayList;
import java.util.List;

public class UserCollection
{
  List<User> li=new ArrayList<>();
  public void  add(String name)
  {
    li.add(new User(name));
  }

  public void printUsers()
  {
    for(User user:li)
    {
      user.print();
    }
  }
}