package Factory_design_pattren_2;

import java.util.HashMap;
import java.util.Map;

public class Factory {
  static Map<String, Vehicle> map = new HashMap<>();
  static{
    map.put("car", new Car());
    map.put("truck", new Truck());
  }

  public static Vehicle createVehicle(String type)
  {
    if(map.containsKey(type))
    {
      return map.get(type);
    }
    else
    {
      throw new IllegalArgumentException("Invalid vehicle type");
    }
  }
  
}
