public class Main 
{
  public static void main(String[] args)
  {
    YoutubeChannel yt=new YoutubeChannel();
    yt.subscribe(new User("chaithanya",0));
    yt.subscribe(new User("babu",1 ));
    yt.notifytheuser();
  }
  
}
