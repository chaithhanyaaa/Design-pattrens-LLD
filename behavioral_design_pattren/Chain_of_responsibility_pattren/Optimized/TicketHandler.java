package Optimized;

public class TicketHandler 
{
  SupportHandler next;
  public void  handleTicket(Ticket tic)
  {
    next.handle(tic);
  }

  public void setNext(SupportHandler next)
  {
    this.next=next;
  }
  
}
