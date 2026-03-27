public class Main {
    public static void main(String[] args) {
        SupportSystem supportSystem = new SupportSystem();

        Ticket t1 = new Ticket("BASIC", "Reset my password");
        Ticket t2 = new Ticket("BILLING", "Refund my payment");
        Ticket t3 = new Ticket("FRAUD", "Someone accessed my account");

        supportSystem.handleTicket(t1);
        supportSystem.handleTicket(t2);
        supportSystem.handleTicket(t3);
    }
}