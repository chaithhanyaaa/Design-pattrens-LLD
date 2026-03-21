public class MusicPlayer{
  State state;
  MusicPlayer()
  {
    state=new StoppedState();
  }

  public void setState(State state)
  {
    this.state=state;
  }
  public void pressPlay()
  {
    state.pressPlay(this);
  }

  public void pressPause()
  {
    state.pressPause(this);
  }
}