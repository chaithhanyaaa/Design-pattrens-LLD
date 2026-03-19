public class Main 
{
  public static void main(String[] args)
  {
    User chaithanya=new User("Chaithanya");
    User maheshBabu=new User("MaheshBabu");
    User ramCharan=new User("RamCharan");

    chaithanya.addFriend(ramCharan);
    chaithanya.addFriend(maheshBabu);

    ramCharan.addFriend(chaithanya);
    ramCharan.addFriend(maheshBabu);

    maheshBabu.addFriend(chaithanya);
    maheshBabu.addFriend(ramCharan);

    chaithanya.sendMsg("hey");
  }
  
}
