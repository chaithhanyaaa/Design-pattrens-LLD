public class Ticket{
  String message;
  String type;
  Ticket(String type,String message)
  {
    this.type=type;
    this.message=message;
  }

  public String getType()
  {
    return type;
  }

  public String getMessage()
  {
    return message;
  }
}