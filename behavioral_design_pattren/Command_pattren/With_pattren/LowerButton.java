package With_pattren;

public class LowerButton  implements Command
{
  Document doc;
  LowerButton(Document doc)
  {
    this.doc=doc;
  }

  public void execute()
  {
    doc.toLower();
  }

  
}
