public class Main {

  public static void main(String[] args)
  {
    String type="babu";
    try{
      Vehicle vehicle = VehicleFactory.createVehicle(type);
      vehicle.start();

    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }
    
  }
  
}
