public class MusicPlayer 
{
  String state;
  MusicPlayer()
  {
    state="STOPPED";
  }

  public void play()
  {
    if(state.equals("STOPPED"))
    {
      System.out.println("Music is playing....");
      state="PLAYING";
    }
    else if(state.equals("PAUSED"))
    {
       System.out.println("Music is resumed....");
       state="PLAYING";
    }
    else
    {
       System.out.println("Already Playing.....");
    }
    
  }


  public void pause()
  {
    if(state.equals("STOPPED"))
    {
      System.out.println("Music is stopped already....");
    }
    else if(state.equals("PAUSED"))
    {
       System.out.println("Music is paused....");
    }
    else
    {
       System.out.println("Music is stopped.....");
       state="STOPPED";
    }

  }
  
}
