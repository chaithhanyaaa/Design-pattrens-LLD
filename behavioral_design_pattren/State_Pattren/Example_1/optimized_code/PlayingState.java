public class PlayingState implements State
{
  public void pressPlay(MusicPlayer player)
  {
    System.out.println("already playing");
  }

  public void pressPause(MusicPlayer player)
  {
    System.out.println("Music is paused...");
    player.setState(new PauseState());
  }
  
}
