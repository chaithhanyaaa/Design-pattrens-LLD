public class Main {

  public static void main(String[] args)
  {
    Paymentprocessor payer=new Paymentprocessor();
    try{
      payer.process("upi");

    }
    catch(InvalidServiceException e)
    {
      System.out.print(e.getMessage());
    }
    
  }
  
}
