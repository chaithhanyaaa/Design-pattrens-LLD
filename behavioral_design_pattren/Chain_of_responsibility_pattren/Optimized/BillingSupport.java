package Optimized;
class BillingSupport implements SupportHandler {

    private SupportHandler next;

    public void setNext(SupportHandler next)
    {
      this.next=next;
    }
    public void handle(Ticket ticket) {
        if(ticket.getType().equals("BILLING"))
        System.out.println("Billing Support handled: " + ticket.getMessage());
        else{
          if(next!=null)
          next.handle(ticket);
          else
            System.out.println("next link is not added");
        }
    }
}
