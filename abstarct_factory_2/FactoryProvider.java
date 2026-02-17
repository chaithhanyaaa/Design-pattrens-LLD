import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryProvider 
{
  public static Factory getFactory(String country) {

        Map<String,Supplier<Factory>> factoryMap = new HashMap<>();
        factoryMap.put("India", () -> new InidanFac());
        factoryMap.put("USA", () -> new UsaFac());
        if(factoryMap.containsKey(country)) {
        return factoryMap.get(country).get();
        }
        throw new IllegalArgumentException("Unknown country: " + country);
        
       
    }
  
}
