public  abstract class Drink{
  public final void  makeDrink()
  {
    boilWater();
    addMilk();
    addIngredient();
    pourintoCup();
  }

  public void boilWater()
  {
    System.out.println("boil water");
  }

  public void addMilk()
  {
    System.out.println("add milk");
  }

  public void pourintoCup()
  {
    System.out.println("poured in to the cup");

  }

  abstract public  void addIngredient();
}