package try_with_pattren;

public class Main 
{
  public static void main(String[] args)
  {
    Creditcard cd=new Creditcard();
    UPI upi=new UPI();
    Paymentprocessor processor=new Paymentprocessor(upi);
    processor.process();
    processor.setServive(cd);
    processor.process();

  }
  /*
  here we have followed Constructor injection
  also not violated Open/Closed principle
  Paymentprocessor is lossly coupled with other class
  so payment processor code will no need to change even other services come
   */
  
}
