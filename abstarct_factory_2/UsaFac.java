public class UsaFac implements Factory 
{
    public Payment createUPI() {
        return new UsaUPI();
    }

    public Payment createCard() {
        return new UsaCard();
    }
  
}
