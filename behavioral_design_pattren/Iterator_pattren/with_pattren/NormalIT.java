import java.util.List;

public class NormalIT  implements Iterator{
  List<User> li;
  int index=0;
  NormalIT(List<User> li)
  {
    this.li=li;
  }

  public boolean hasNext()
  {
    return index<li.size();

  }
  public User next()
  {
    return li.get(index++);
    
  }
  
}
