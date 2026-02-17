public class Main {
  public static void main(String[] args) {
    BookShope bookShope = new BookShope();
    bookShope.loadBooks();
    BookShope clonedBookShop = bookShope.clone();
    clonedBookShop.getBooks().remove(0);
    System.out.println("Original book shop");
    bookShope.printBooks();
    System.out.println("Cloned book shop");
    clonedBookShop.printBooks();
  }
  
}
