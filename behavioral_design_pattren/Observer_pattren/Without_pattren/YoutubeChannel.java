import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel 
{
  List<User> subscribers=new ArrayList<>();
  public void subscribe(User user)
  {
    subscribers.add(user);
    
  }
  public void notifytheuser()
  {
    for(User user:subscribers)
    {
      user.sendMessage();
    }

  }
  
}
