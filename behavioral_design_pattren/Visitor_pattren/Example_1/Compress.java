public class Compress implements Visitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Compressing text: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Compressing image: " + imageElement.getImagePath());
    }

    @Override
    public void visit(TableElement tableElement) {
        System.out.println("Compressing table with " + tableElement.getData());
    }
  
}
