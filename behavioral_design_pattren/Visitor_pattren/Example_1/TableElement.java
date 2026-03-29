public class TableElement implements DocElement
{
    private String data;

    public TableElement(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
  
}
