public class VehicleFactory 
{
  public static  Vehicle createVehicle(String type)
  {
    if(type.equals("car"))
    {
      return new Car();
    }
    else if(type.equals("truck"))
    {
      return new Truck();
    }
    else
    {
      throw new IllegalArgumentException("Invalid vehicle type");
    }
  }

  
}
