package Optimized;

public interface SupportHandler {
   void handle(Ticket ticket);
   void setNext(SupportHandler next);
 
} 
