// Our Interface
interface DiscountScheme {
    void applyDiscount();
}

public class Main {
    public static void main(String[] args) {
        
       
        DiscountScheme seniorCitizenDiscount = new DiscountScheme() {
            @Override
            public void applyDiscount() {
                System.out.println("20% discount applied for Senior Citizen.");
            }
        };

        //while creating object time only we are writing  the class body and methode body

        seniorCitizenDiscount.applyDiscount();
        
        // Another one-time use implementation
        DiscountScheme firstTimeUser = new DiscountScheme() {
            @Override
            public void applyDiscount() {
                System.out.println("50% discount applied for first-time booking.");
            }
        };

        firstTimeUser.applyDiscount();
    }
}


/*

-> so it good to use when we are using that methode only once or twice in the entire 
program

-> if it has only one methode(function interface) go for lamda expressions
-> if it has 2-3 methode go for anonymous class
 */