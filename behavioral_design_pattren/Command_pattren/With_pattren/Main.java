package With_pattren;

public class Main 
{
  public static void main(String[] args) {
    Document file=new Document("hello world");
    UpperButton up=new UpperButton(file);
    Button button=new Button(up);
    button.onClick();
    
  }
  
}
