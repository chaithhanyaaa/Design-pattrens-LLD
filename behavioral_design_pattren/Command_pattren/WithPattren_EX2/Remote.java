public class Remote {
  Command command;
  Remote(Command command)
  {
    this.command=command;
  }
  public void setCommand(Command cmd)
  {
    this.command=cmd;
  }

  public void click()
  {
    command.execute();
  }
}
