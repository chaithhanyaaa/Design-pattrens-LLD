public interface Visitor {
    void visit(TextElement textElement);
    void visit(ImageElement imageElement);
    void visit(TableElement tableElement);
  
}
