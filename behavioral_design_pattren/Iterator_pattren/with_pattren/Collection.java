import java.util.*;
public class Collection {
  List<User> li=new ArrayList<>();

  public void add(String name,boolean isactive,boolean ispremium)
  {
    li.add(new User(name,isactive,ispremium));
  }

  public Iterator getPremiumUserIterator()
  {
    return new PremiumIT(li);

  }

  public Iterator getNormalIterator()
  {
    return new NormalIT(li);
  }

  public Iterator getActivIterator()
  {
    return new ActiveIT(li);
  }

  
}
