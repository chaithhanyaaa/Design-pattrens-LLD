import java.util.*;
public class PremiumIT implements Iterator 
{
  List<User> li;
  int index=0;

  PremiumIT(List<User> li)
  {
    this.li=li;
  }

  @Override
  public boolean hasNext() 
  {
    while(index<li.size())
    {
      if(li.get(index).ispremium)
        return true;
      index++;
    }
    return false;

    
  }

  @Override
  public User next() 
  {
    return li.get(index++);

    
  }
  
  
}
