public class SupportSystem 
{
   public void handleTicket(Ticket ticket) {
        if (ticket.getType().equals("BASIC")) {
            System.out.println("Basic Support handled: " + ticket.getMessage());
        } 
        else if (ticket.getType().equals("BILLING")) {
            System.out.println("Billing Support handled: " + ticket.getMessage());
        } 
        else if (ticket.getType().equals("FRAUD")) {
            System.out.println("Fraud Support handled: " + ticket.getMessage());
        } 
        else {
            System.out.println("No team available to handle this ticket.");
        }
    }
  
}
