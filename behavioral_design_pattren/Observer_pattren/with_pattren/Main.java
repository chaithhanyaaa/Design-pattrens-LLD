public class Main {
  public static void main(String[] args) {
    YTChannel Telsko=new YTChannel();
    Observer chaithh=new User("chaithanya");
    Observer Maheshbabu=new Premiumuser("babu");
    Observer prabas=new EmailUser("salaar@gmail.com", "prabas");

    
    Telsko.subscribe(chaithh);
    Telsko.subscribe(Maheshbabu);
    Telsko.subscribe(prabas);
    Telsko.update();

  }
}
