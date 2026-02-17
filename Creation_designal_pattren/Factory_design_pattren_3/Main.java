package Factory_design_pattren_3;

public class Main 
{
  public static void main(String[] args) {
        Vehicle car = Factory.createVehicle("car");
        car.drive();

        Vehicle truck = Factory.createVehicle("truck");
        truck.drive();
    }
  
}
