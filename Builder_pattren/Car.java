public class Car 
{
  private String color;
  private int seats;
  private boolean isElectric;
  private boolean sunroof;
  private int topSpeed;
  private int tires;
  private String ownername;

  private Car(Builder builder)
  {
    this.color = builder.color;
    this.seats = builder.seats;
    this.isElectric = builder.isElectric;
    this.sunroof = builder.sunroof;
    this.topSpeed = builder.topSpeed;
    this.tires = builder.tires;
    this.ownername = builder.ownername;
  }

  public String toString()
  {
    return "Car [color=" + color + ", seats=" + seats + ", isElectric=" + isElectric + ", sunroof=" + sunroof
        + ", topSpeed=" + topSpeed + ", tires=" + tires + ", ownername=" + ownername + "]";
  }

  static class Builder
  {
    private String color;
    private int seats;
    private boolean isElectric;
    private boolean sunroof;
    private int topSpeed;
    private int tires;
    private String ownername;

    public Builder setColor(String color)
    {
      this.color = color;
      return this;
    }

    public Builder setOwnername(String ownername)
    {
      this.ownername = ownername;
      return this;
    }

    public Builder setSeats(int seats)
    {
      this.seats = seats;
      return this;
    }

    public Builder setIsElectric(boolean isElectric)
    {
      this.isElectric = isElectric;
      return this;
    }

    public Builder setSunroof(boolean sunroof)
    {
      this.sunroof = sunroof;
      return this;
    }

    public Builder setTopSpeed(int topSpeed)
    {
      this.topSpeed = topSpeed;
      return this;
    }

    public Builder setTires(int tires)
    {
      this.tires = tires;
      return this;
    }

    public Car build()
    {
      if(ownername == null || ownername.isEmpty())
      {
        throw new IllegalStateException("Owner name is required");
      }
      return new Car(this);
    }
  }


  
}
