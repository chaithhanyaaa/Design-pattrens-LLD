package Optimized;
class Ticket {
    private String type;
    private String message;

    public Ticket(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}