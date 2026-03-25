public class DrinkMaker 
{
  Drink drink;
  DrinkMaker(Drink drink)
  {
    this.drink=drink;
  }

  public void makeDrink()
  {
    drink.makeDrink();;
  }

  public void changeTheDrink(Drink drink)
  {
    this.drink=drink;

  }
  
}
