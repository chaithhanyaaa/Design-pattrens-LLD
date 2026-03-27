package Optimized;
class BasicSupport implements SupportHandler {

   
     private SupportHandler next;

    public void setNext(SupportHandler next)
    {
      this.next=next;
    }
    public void handle(Ticket ticket) {
        if(ticket.getType().equals("BASIC"))
        System.out.println("Basic Support handled: " + ticket.getMessage());
        else{
          if(next!=null)
          {
            next.handle(ticket);
          }
          else
          {
            System.out.println("next link is not added");
          }
        }
    }
}