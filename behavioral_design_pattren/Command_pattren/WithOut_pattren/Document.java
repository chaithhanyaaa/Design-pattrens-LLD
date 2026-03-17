package WithOut_pattren;
public class Document{

  String s;
  Document(String s)
  {
    this.s=s;
  }

  public void toUpperCase()
  {
    s=s.toUpperCase();
    System.out.println(s);

  }

  public void toLowerCase()
  {
    s=s.toLowerCase();
    System.out.println(s);
    
  }
}