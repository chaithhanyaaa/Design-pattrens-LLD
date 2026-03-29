public class Export implements Visitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Exporting text: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Exporting image from path: " + imageElement.getImagePath());
    }

    @Override
    public void visit(TableElement tableElement) {
        System.out.println("Exporting table with " + tableElement.getData());
    }
  
}
