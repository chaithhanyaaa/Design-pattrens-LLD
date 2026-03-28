public class VendingMachine{
    private State state;
    private Service service;
    private StockService stockService;
    private String selectedItem;
    private int enteredAmount;

    public VendingMachine(StockService stockService)
    {
        this.stockService = stockService;
    }

    public String getSelectedItem()
    {
        return selectedItem;
    }

    public int getEnteredAmount()
    {
        return enteredAmount;
    }

    public void setSelectedItem(String item)
    {
        this.selectedItem = item;
    }

    public void setEnteredAmount(int amount)
    {
        this.enteredAmount = amount;
    }

    public void addItem(String item,int price,int quantity)
    {
        stockService.stock.put(item,quantity);
        stockService.price.put(item,price);
    }

    public void addStock(String item,int quantity)
    {
        int currentStock = stockService.stock.getOrDefault(item,0);
        stockService.stock.put(item,currentStock+quantity);
    }

    public void removeStock(String item,int quantity)
    {
        int currentStock = stockService.stock.getOrDefault(item,0);
        if(currentStock>=quantity)
        {
            stockService.stock.put(item,currentStock-quantity);
        }
        else{
            System.out.println("Not enough stock to remove");
        }
    }

    public void removeItem(String item)
    {
        stockService.stock.remove(item);
        stockService.price.remove(item);
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void setService(Service service)
    {
        this.service = service;
    }

    public void selectProduct(String product)
    {
        state.selectProduct(this,product,stockService);
    }

    public void setPrice(int amount)
    {
        state.setPrice(this,amount,stockService);
    }

    public void buyProduct()
    {
        state.makePayment(stockService,this,service);
    }

    public void cancel()
    {
        state.cancel(this);
    }

}