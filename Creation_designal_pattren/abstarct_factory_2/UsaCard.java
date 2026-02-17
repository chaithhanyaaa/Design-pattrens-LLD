public  class UsaCard implements Payment
{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using USA Card");
    }
  
}
