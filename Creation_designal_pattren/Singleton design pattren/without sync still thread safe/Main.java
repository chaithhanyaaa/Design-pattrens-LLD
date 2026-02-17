public class Main {

  public static void main(String[] args) {
    Eagarsingleton singleton1 = Eagarsingleton.getInstance();
    Eagarsingleton singleton2 = Eagarsingleton.getInstance();

    System.out.println(singleton1);
    System.out.println(singleton2);
  }
  
}
