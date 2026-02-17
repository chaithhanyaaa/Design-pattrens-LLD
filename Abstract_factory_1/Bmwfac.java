package Abstract_factory_1;

public class Bmwfac implements VehicleFactory {
  
  @Override
  public Vehicle createVehicle() {
    return new Bmw();
  }
  
}
