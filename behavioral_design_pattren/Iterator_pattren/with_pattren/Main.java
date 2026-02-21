public class Main 
{
  public static void main(String[] args) {
    Collection collection=new Collection();
    collection.add("chaithh",true,false);
    collection.add("maheshbabu",false,true);
    collection.add("prabas",true,true);
    collection.add("xyz",true,false);
    Iterator IT=collection.getNormalIterator();
    while(IT.hasNext())
    {
      User user=IT.next();
      System.out.println(user.id+" "+user.name);
    }
  }
  
  
}
