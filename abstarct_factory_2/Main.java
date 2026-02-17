public class Main 
{
  public static void main(String[] args)
  {
    String country = "japan";
    try{
    Factory factory = FactoryProvider.getFactory(country);
    Payment upiPayment = factory.createUPI();
    Payment cardPayment = factory.createCard();
    upiPayment.pay(100.0);
    cardPayment.pay(200.0);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  
    //now both the payments are made using the same county payment methods
  }
  
}
