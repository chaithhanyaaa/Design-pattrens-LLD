import java.util.HashMap;

public class SmartRemote {
  HashMap<String,Command> buttons=new HashMap<>();
  public void setButton(String label, Command command) 
  {
    buttons.put(label, command);
  }

  public void press(String label) {
        if (buttons.containsKey(label)) {
            buttons.get(label).execute();
        } else {
            System.out.println("Button '" + label + "' not configured.");
        }
    }
}
