public class Mythread  extends Thread{
    Config c;
    public void run(){
        c=Config.getInstance();
    }
    public Config getConfig()
    {
        return c;
    }
  
}
