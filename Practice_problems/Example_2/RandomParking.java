import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomParking implements ParkingStratergy
{

  @Override
  public Spot doPark(List<Spot> li, Vehicle v) {
   List<Spot> freeSpots=new ArrayList<>();
   for(Spot s:li)
   {
    if(!s.isOccupied)
    {
      freeSpots.add(s);
    }
   }
   if(freeSpots.size()==0)return null;//no freespots were found
   Random rand=new Random();
   return freeSpots.get(rand.nextInt(freeSpots.size()));
  }
  
}
