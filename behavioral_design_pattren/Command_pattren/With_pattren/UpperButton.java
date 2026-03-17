package With_pattren;

public class UpperButton implements Command
{
  Document doc;
  UpperButton(Document doc)
  {
    this.doc=doc;
  }
  public void execute()
  {
    doc.toUpper();
  }
  
}
