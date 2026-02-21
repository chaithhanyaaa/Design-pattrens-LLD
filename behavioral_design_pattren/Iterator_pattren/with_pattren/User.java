public class User{
  int id;
  static int counter=1;
  String name;
  boolean isactive,ispremium;
  public User(String name,boolean isactive,boolean ispremium)
  {
    this.id=counter++;
    this.name=name;
    this.isactive=isactive;
    this.ispremium=ispremium;
  }
}