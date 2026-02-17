public class Eagarsingleton {
    private static final Eagarsingleton instance = new Eagarsingleton();

    private Eagarsingleton() {
        
    }

    public static Eagarsingleton getInstance() {
        return instance;
    }
}