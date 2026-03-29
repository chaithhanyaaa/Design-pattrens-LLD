public class ImageElement implements DocElement
{
  private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
  
}
