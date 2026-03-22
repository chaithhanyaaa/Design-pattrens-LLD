import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLot 
{
  List<Spot> spots;
  HashMap<Vehicle,Spot> parked =new HashMap<>();
  ParkingStratergy stratergy;
  int size;
  ParkingLot(int size,ParkingStratergy stratergy)
  {
    this.stratergy=stratergy;
    spots=new ArrayList<>();
    for(int i=1;i<=size;i++)
    {
      spots.add(new Spot(false, i, null));
    }
  }

  public void setStratergy(ParkingStratergy stratergy)
  {
    this.stratergy=stratergy;
  }

  public void doPark(Vehicle v)
  {
    Spot s=stratergy.doPark(spots, v);
    if(s==null)
    {
      System.out.println("no free spots to park your "+v.getType());
      return;
    }
    parked.put(v,s);
    s.isOccupied=true;
    s.v=v;
    System.out.println("your "+v.getType()+" is parked at the spot of the id:"+s.id);
  }

  public void doUnPark(Vehicle v)
  {
    if(!parked.containsKey(v))
    {
      System.out.println("your "+v.getType()+" is not parked");
      return;
    }
    Spot s=parked.get(v);
    s.isOccupied=false;
    s.v=null;
    System.out.println("your "+v.getType()+" is unparked from the spot:"+s.id);
    parked.remove(v);
  }
  
  
}
