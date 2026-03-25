public class Main 
{
  public static void main(String[] args) {
    Tea tea=new Tea();
    DrinkMaker maker=new DrinkMaker(tea);
    maker.makeDrink();
  }
  
}
