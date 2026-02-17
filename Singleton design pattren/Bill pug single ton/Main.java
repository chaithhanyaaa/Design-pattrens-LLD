public class Main {
  public static void main(String[] args) {
    Runnable r1 = () -> {
      Billphug b1 = Billphug.getInance();
      System.out.println(b1);
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r1);
    t1.start();
    t2.start();
  }
  
}
