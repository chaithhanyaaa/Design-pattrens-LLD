public class UPI  implements Service{

    @Override
    public void pay(int amount) {
        System.out.println("Payment of "+amount+" made using UPI");
    }
    
}