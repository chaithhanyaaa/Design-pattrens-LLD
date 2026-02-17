public class InidanFac implements Factory 
{
    @Override
    public Payment createUPI() {
        return new InidanUPI();
    }

    @Override
    public Payment createCard() {
        return new IndianCard();
    }
  
}
