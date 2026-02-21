import java.util.List;

public class ActiveIT  implements Iterator
{
   private List<User> users;
    private int index = 0;

    ActiveIT(List<User> users) {
        this.users = users;
    }

    public boolean hasNext() {
        while (index < users.size()) {
            if (users.get(index).isactive) {
                return true;
            }
            index++;
        }
        return false;
    }

    public User next() {
        return users.get(index++);
    }
  
}
