import javax.print.Doc;

public class Main 
{
  public static void main(String[] args) {
    DocElement text = new TextElement("Hello, World!");
    DocElement image = new ImageElement("path/to/image.jpg");
    DocElement table = new TableElement("Table data");

    Visitor readVisitor = new Read();
    Visitor compressVisitor = new Compress();
    Visitor exportVisitor = new Export();
    text.accept(readVisitor);
    image.accept(readVisitor);
    table.accept(readVisitor);

    text.accept(compressVisitor);
    image.accept(compressVisitor);
    table.accept(compressVisitor);

    text.accept(exportVisitor);
    image.accept(exportVisitor);
    table.accept(exportVisitor);

  }
  
}
