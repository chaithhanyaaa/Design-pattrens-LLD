abstract class PaymentProcessor {
    String currency = "INR";

    // Abstract method that MUST be implemented
    abstract void process(double amount);

    // Concrete method that can be used as is
    void showCurrency() {
        System.out.println("Processing in: " + currency);
    }
}

public class Main2 {
  public static void main(String[] args) {
        
        // Defining and Instantiating the Abstract Class anonymously
        PaymentProcessor upiPayment = new PaymentProcessor() {
            @Override
            void process(double amount) {
                System.out.println("Processing UPI payment of ₹" + amount);
            }
        };

        upiPayment.showCurrency(); // Calling concrete method
        upiPayment.process(500);   // Calling our anonymous implementation
    }
  
}

/*  it looks like we have class name PaymentProcess but it is not actually that is the 
parent class not the actual class.*/

// instead of clearting new class that inherits the abtract parent class we used this anonymous class
