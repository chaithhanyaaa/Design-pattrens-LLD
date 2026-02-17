package Abstract_factory_1;

public class Main 
{
  public static void main(String[] args)
  {
    VehicleFactory bmwFactory = FactoryProvider.getFactory("BMW");
    Vehicle bmw = bmwFactory.createVehicle();
    bmw.drive();

    VehicleFactory hondaFactory = FactoryProvider.getFactory("Honda");
    Vehicle honda = hondaFactory.createVehicle();
    honda.drive();
  }
  
}
