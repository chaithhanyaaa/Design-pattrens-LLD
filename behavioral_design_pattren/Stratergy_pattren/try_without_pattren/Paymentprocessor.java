public class Paymentprocessor 
{
  Payment payment;
  public void process(String service) throws InvalidServiceException
  {
    if(service.equals("upi"))
    {
      payment=new UPI();
      payment.pay();
    }
    else if(service.equals("card"))
    {
      payment=new Creditcard();
      payment.pay();
    }
    else
      {
        throw new InvalidServiceException("invalid service");

      }
  }
  
}
