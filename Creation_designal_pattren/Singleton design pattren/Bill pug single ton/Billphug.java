public class Billphug
{
    private Billphug() {
    }

    public  static Billphug getInance()
    {
      return holder.instance;
    }

    static class holder
    {
        private static Billphug instance = new Billphug();
    }

}