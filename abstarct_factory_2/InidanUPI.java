public class InidanUPI implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paying " + amount + " using Indian UPI");
    }
  
}
