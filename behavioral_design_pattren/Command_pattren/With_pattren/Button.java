package With_pattren;

public class Button 
{
  Command cmd;
  Button(Command cmd)
  {
    this.cmd=cmd;
  }

  public void setCmd(Command cmd)
  {
    this.cmd=cmd;
  }

  public void onClick()
  {
    cmd.execute();
  }
  
}
