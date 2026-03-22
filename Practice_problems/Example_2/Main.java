public class Main 
{
  public static void main(String[] args) 
  {
    NearestParking near=new NearestParking();
    ParkingLot lot=new ParkingLot(3, near);
    Car c1=new Car();
    lot.doPark(c1);
    Bike b1=new Bike();
    lot.doPark(b1);
    Car c2=new Car();
    lot.doPark(c2);

    Bike b2=new Bike();
    lot.doPark(b2);

    lot.doUnPark(c1);
    lot.doUnPark(b2);
    lot.doUnPark(b1);
    lot.doUnPark(c2);

    RandomParking random=new RandomParking();
    lot.setStratergy(random);

    lot.doPark(b2);
    lot.doPark(c2);
    lot.doPark(c1);
    lot.doPark(b1);

    
  }
  
}
