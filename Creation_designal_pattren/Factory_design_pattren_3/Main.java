public class Main 
{
  public static void main(String[] args)
  {
    // Register vehicle types with the factory
    Factory.register("car", Car::new);
    Factory.register("bike", Bike::new);

    // Create and start a car
    Vehicle car = Factory.createVehicle("car");
    car.start();

    // Create and start a bike
    Vehicle bike = Factory.createVehicle("bike");
    bike.start();
  }
  
}
