public class StoppedState  implements State
{
  public void pressPlay(MusicPlayer player)
  {
    System.err.println("Music is playing.....");
    player.setState(new PlayingState());
  }

  public void pressPause(MusicPlayer player)
  {
    System.out.print("not able to pause,music is already stopped");
  }

 
  
}
