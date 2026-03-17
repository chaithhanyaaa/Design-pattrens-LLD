package With_pattren;

public class Document 
{
  String s;
  Document(String s)
  {
    this.s=s;
  }

  public void toUpper()
  {
    s=s.toUpperCase();
    System.out.println(s);
  }

  public void toLower()
  {
    s=s.toLowerCase();
    System.out.println(s);
  }
  
}
