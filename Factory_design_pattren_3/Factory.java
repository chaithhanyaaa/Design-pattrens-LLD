package Factory_design_pattren_3;
import java.util.*;
import java.util.function.Supplier;

public class Factory 
{
  static Map<String,Supplier<Vehicle>> vehicleMap = new HashMap<>();

    static {
        vehicleMap.put("car", () -> new Car());
        vehicleMap.put("truck", ()-> new Truck());
    }

    public static Vehicle createVehicle(String type) {
        return vehicleMap.get(type).get();
    }
  
}
