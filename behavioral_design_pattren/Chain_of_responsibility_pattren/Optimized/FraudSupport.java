package Optimized;
class FraudSupport implements SupportHandler {
    private SupportHandler next;

    public void setNext(SupportHandler next)
    {
      this.next=next;
    }
    public void handle(Ticket ticket) {
        if(ticket.getType().equals("FRAUD"))
        System.out.println("Fraud Support handled: " + ticket.getMessage());
        else{
          if(next!=null)
          {
            next.handle(ticket);
          }
          else{
            System.out.println("next link is not there");
          }
        }
    }
}
