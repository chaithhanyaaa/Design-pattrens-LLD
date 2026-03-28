public class OutOfStockState implements State{

  @Override
  public void setPrice(VendingMachine machine, int amount, StockService stockService) {
    System.out.println("Product is out of stock. Please select another product.");
    machine.setState(new IdleState());
  }

  @Override
  public void selectProduct(VendingMachine machine, String product, StockService stockService) {
    System.out.println("Product is out of stock. Please select another product.");
    machine.setState(new IdleState());
    machine.setSelectedItem(null);
    machine.setEnteredAmount(0);
  }

  @Override
  public void makePayment(StockService service, VendingMachine machine, Service paymentservice) {
    System.out.println("Product is out of stock. Please select another product.");
    machine.setState(new IdleState());
    machine.setSelectedItem(null);
    machine.setEnteredAmount(0);
  }

  @Override
  public void cancel(VendingMachine machine) {
    System.out.println("Transaction cancelled. Returning to idle state.");
    machine.setSelectedItem(null);
    machine.setEnteredAmount(0);
    machine.setState(new IdleState());
  }

  
}
