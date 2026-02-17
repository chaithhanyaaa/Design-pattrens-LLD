public class Config {
    int state=10;
    private static Config instance;
    private Config(){
    }
    public static Config getInstance()
    {
        if(instance==null)
        {
            synchronized(Config.class)
            {
                if(instance==null)
                {
                    instance=new Config();
                }
            }
        }
        return instance;
    }
  
}
