package WithOut_pattren;

public class Main 
{
  public static void main(String[] args) {
    Document file=new Document("hello world");
    UpperButton UP=new UpperButton(file);
    UP.onClick();
  }
  
}
