package withpattren;

import java.util.ArrayList;

public class Mediator 
{
  ArrayList<User> users;

  Mediator()
  {
    users=new ArrayList<>();
  }

  public void addUser(User user)
  {
    users.add(user);
  }
  public void sendMsg(String message, User sender) {

        // ✅ Centralized spam filter
        if (message.contains("spam")) {
            System.out.println("Message blocked due to spam!");
            return;
        }

        for (User user : users) {
            if (user != sender) {
                user.receiveMsg(message, sender);
            }
        }
    }

  

  
}
