public class TextElement implements DocElement
{
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
  
}
