package try_with_pattren;

public class Paymentprocessor {
  Payment service;
  public Paymentprocessor(Payment service)
  {
    this.service=service;
  }
  public void setServive(Payment service)
  {
    this.service=service;
  }

  public void process()
  {
    service.pay();
  }
  
}
