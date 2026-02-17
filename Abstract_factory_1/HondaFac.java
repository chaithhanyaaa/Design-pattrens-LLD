package Abstract_factory_1;

public  class HondaFac implements VehicleFactory {
  
  @Override
  public Vehicle createVehicle() {
    return new Honda();
  }
  
}
