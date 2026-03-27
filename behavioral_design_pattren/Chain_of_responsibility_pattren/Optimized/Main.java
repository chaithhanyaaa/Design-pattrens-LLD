package Optimized;

public class Main {
  public static void main(String[] args) {
       TicketHandler ticketHandler=new TicketHandler();
       SupportHandler basic = new BasicSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler fraud = new FraudSupport();

        // create chain

        ticketHandler.setNext(basic);
        basic.setNext(billing);
        billing.setNext(fraud);

        // test tickets
        Ticket t1 = new Ticket("BASIC", "Reset password");
        Ticket t2 = new Ticket("BILLING", "Refund request");
        Ticket t3 = new Ticket("FRAUD", "Account hacked");
        Ticket t4 = new Ticket("UNKNOWN", "Some random issue");

        // send requests into chain
        ticketHandler.handleTicket(t1);
       
  }
  
}
