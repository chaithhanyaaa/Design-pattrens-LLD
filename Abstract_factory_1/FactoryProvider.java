package Abstract_factory_1;

public class FactoryProvider 
{
  public static VehicleFactory getFactory(String factoryType) {
    if (factoryType.equalsIgnoreCase("BMW")) {
      return new Bmwfac();
    } else if (factoryType.equalsIgnoreCase("Honda")) {
      return new HondaFac();
    }
    return null;
  }
  
}
