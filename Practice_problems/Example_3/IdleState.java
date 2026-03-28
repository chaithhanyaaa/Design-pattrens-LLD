public class IdleState  implements State{

  @Override
  public void setPrice(VendingMachine machine, int amount, StockService stockService) 
  {
    System.out.println("Please select a product first");
  }

  @Override
  public void selectProduct(VendingMachine machine, String product, StockService stockService) 
  {
    if(!stockService.isAvailable(product)){
        System.out.println("Product not available");
        machine.setState(new OutOfStockState());
        return;
    }
    else
    {
        machine.setSelectedItem(product);
        machine.setEnteredAmount(0);
        machine.setState(new WaitingForMoneyState());
    }


  }

  @Override
  public void makePayment(StockService service, VendingMachine machine, Service paymentservice) 
  {
   System.out.println("Please select a product and insert money first");
  }

  @Override
  public void cancel(VendingMachine machine) 
  {
    System.out.println("No transaction to cancel");
  }
  

  
}
