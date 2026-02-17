import java.util.*;
import java.util.function.Supplier;
public class Factory 
{
   private static Map<String,Supplier<Vehicle>> registry = new HashMap<>();

    public static void register(String vehicleType, Supplier<Vehicle> supplier) {
        registry.put(vehicleType, supplier);
    }

    public static Vehicle createVehicle(String vehicleType) {
        Supplier<Vehicle> supplier = registry.get(vehicleType);
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
    }
  
}
