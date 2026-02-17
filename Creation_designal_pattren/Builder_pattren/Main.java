public class Main 
{
  public static void main(String[] args)
  {
    try{
      Car.Builder builder = new Car.Builder();
      Car car = builder.setColor("blue")
      .setSeats(6)
      .setIsElectric(true)
      .setOwnername("chaithh")
      .build();
      System.out.println(car.toString());

    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
  
}

/*

-> in regular way first we create a object and 
then we add the attributes to it .

-> in that case sometimes we may forget to add imp 
attributes to the object

Car car=new Car();
car.setColor("blue");
car.setSeats(6);

-> here we have forget the to add the owner name.

-> so to avaoid this even we put a check ryt after the creation of
the object but we can not immmediatly delete the object

-> so we use the builder instead of build object and adding
the attributes to it we firld build the and then we call the builder methode

-> also the other advantage of builder is that we can add the attributes 
in any order we want and also we can add only the attributes that 
we want to add and we can skip the rest of the attributes

-> no order of the attributes is fixed in builder and also we can skip the 
attributes that we dont want to add

-> only in the builder methode we have to check if the imp att are added or not
if not we throw an exception and we can not create the object if the imp att are not added

-> we created an static class since if that was not static
Car car =new Car();
Car.Builder builder = car.new Builder();
-> this does nt make sense.
-> goal is to buil builder first then we create the obj with same att 
 */
