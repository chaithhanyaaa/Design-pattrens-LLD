public  class Tv{
  boolean on;
  Tv()
  {
    on=false;
  }

  public void TVon()
  {
    on=true;
    System.out.println("tv is on");
  }

  public void TVOff()
  {
    on=false;
    System.out.println("tv is off");

  }
}