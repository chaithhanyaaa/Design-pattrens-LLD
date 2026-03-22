import java.util.List;

public class NearestParking implements ParkingStratergy{

  @Override
  public Spot doPark(List<Spot> li, Vehicle v) {
    for(Spot sp:li)
    {
      if(!sp.isOccupied)
      {
        return sp;
      }
     
    }
    return null;

  }
  
}
