public class Test {
  public static void main(String[] args) throws InterruptedException {
    Mythread t1=new Mythread();
    Mythread t2=new Mythread();
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    t1.getConfig().state=20;
    System.out.println(t1.getConfig().state);
    System.out.println(t2.getConfig().state);
    
  }
  
}
