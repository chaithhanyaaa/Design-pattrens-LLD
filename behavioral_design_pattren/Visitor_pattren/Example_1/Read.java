public class Read  implements Visitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Reading text: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Reading image from path: " + imageElement.getImagePath());
    }

    @Override
    public void visit(TableElement tableElement) {
        System.out.println("Reading table with " + tableElement.getData());
    }
  
}
