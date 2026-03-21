public class PauseState implements State 
{

  @Override
  public void pressPlay(MusicPlayer player) 
  {
    System.out.println("Music started playing....");
    player.setState(new PlayingState());
   
  }

  @Override
  public void pressPause(MusicPlayer palyer) 
  {
    System.out.println("music is already paused..");
    
  }
  
  
}
