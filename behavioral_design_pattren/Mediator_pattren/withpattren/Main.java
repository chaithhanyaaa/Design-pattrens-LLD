package withpattren;

public class Main 
{
 public static void main(String[] args) {

   Mediator middleman=new Mediator();
  User  Chaithanya=new User("Chaithanya",middleman);
  User  maheshBabu=new User("maheshbabu",middleman);
  User ramCharan=new User("ramCharn",middleman);

  middleman.addUser(ramCharan);
  middleman.addUser(Chaithanya);
  middleman.addUser(maheshBabu);

  maheshBabu.sendMsg("hey");
  
 }

  


  
}
