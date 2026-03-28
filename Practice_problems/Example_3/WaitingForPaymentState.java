public class WaitingForPaymentState implements State{

  @Override
  public void setPrice(VendingMachine machine, int amount, StockService stockService) {
    System.out.println("Price already set. Please make payment.");
  }

  @Override
  public void selectProduct(VendingMachine machine, String product, StockService stockService) {
    System.out.println("Product already selected. Please make payment.");
  }

  @Override
  public void makePayment( StockService stockService,VendingMachine machine, Service paymentservice) {
    paymentservice.pay(machine.getEnteredAmount());
    stockService.reduceStock(machine.getSelectedItem());
    System.out.println("Please collect your product: "+machine.getSelectedItem());
    machine.setSelectedItem(null);
    machine.setEnteredAmount(0);
    machine.setState(new IdleState());
  }

  @Override
  public void cancel(VendingMachine machine) 
  {
    System.out.println("Transaction cancelled. Returning to idle state.");
    machine.setSelectedItem(null);
    machine.setEnteredAmount(0);
    machine.setState(new IdleState());
  }
  
  
}
