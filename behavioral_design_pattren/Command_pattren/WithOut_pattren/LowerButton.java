package WithOut_pattren;
public class LowerButton {
  Document doc;
  public LowerButton(Document doc)
  {
    this.doc=doc;
  }

  public void onClick()
  {
    doc.toLowerCase();
  }
  
}
