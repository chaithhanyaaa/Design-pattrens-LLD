import java.util.HashMap;

public class StockService {
  HashMap<String,Integer> stock;
  HashMap<String,Integer> price;
  public StockService()
  {
    stock = new HashMap<>();
    price = new HashMap<>();
  }

  public boolean isAvailable(String item)
  {
    return stock.getOrDefault(item,0)>0;
  }

  public int getPrice(String item)
  {
    return price.getOrDefault(item,0);
  }

  public void reduceStock(String item)
  {
    int currentStock = stock.getOrDefault(item,0);
    if(currentStock>0)
    {
        stock.put(item,currentStock-1);
    }
  }
  
}
