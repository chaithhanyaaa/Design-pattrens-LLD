public class WaitingForMoneyState implements State{

  @Override
  public void setPrice(VendingMachine machine, int amount, StockService stockService) 
  {
    if(amount<stockService.getPrice(machine.getSelectedItem()))
    {
        System.out.println("Insufficient amount. Please set more money.");
        return;
    }
    else if(amount>stockService.getPrice(machine.getSelectedItem()))
    {
        System.out.println("Amount exceeds price. Please set the exact amount.");
        return;
    }
    else
    {
        machine.setEnteredAmount(amount);
        machine.setState(new WaitingForPaymentState());
    }
  }

  @Override
  public void selectProduct(VendingMachine machine, String product, StockService stockService) 
  {
    System.out.println("Product already selected. Please insert money.");
  }

  @Override
  public void makePayment(StockService service, VendingMachine machine , Service paymentservice) 
  {
    System.out.println("Please set the price first");
  }

  @Override
  public void cancel(VendingMachine machine) {
    System.out.println("Transaction cancelled. ");
    machine.setState(new IdleState());
  }
  
  
}
