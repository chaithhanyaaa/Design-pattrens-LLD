package WithOut_pattren;
public class UpperButton 
{
  Document doc;
  UpperButton(Document doc){
    this.doc=doc;
  }

  public void onClick()
  {
    doc.toUpperCase();
  } 
}
