public interface State {
  void setPrice(VendingMachine machine,int amount,StockService stockService);
  void selectProduct(VendingMachine machine,String product,StockService stockService);
  void makePayment(StockService service,VendingMachine machine,Service paymentservice);
  void cancel(VendingMachine machine);


  
  
} 