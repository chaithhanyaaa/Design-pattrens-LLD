import java.util.ArrayList;
import java.util.List;
public class BookShope 
{
  List<Book> books;
  public BookShope(){
    books = new ArrayList<Book>();
  }
  public void loadBooks(){
    //Assume we load this from the database which probabily  takes some time
    for(int i=0;i<10;i++)
    {
      this.books.add(new Book());
       this.books.get(i).setId(i);
       this.books.get(i).setTitle("Book "+i);
    }
  }

  public List<Book> getBooks(){
    return this.books;
  }

  public void printBooks()
  {
    for(Book book: this.books){
      System.out.println("Book id: "+book.getId()+" Book title: "+book.getTitle());
    }
  }

  public BookShope clone()
  {
    BookShope newBook= new BookShope();
    for(Book book: this.books){
      Book newBook1 = new Book();
      newBook1.setId(book.getId());
      newBook1.setTitle(book.getTitle());
      newBook.getBooks().add(newBook1);
    }//deep copy not shallow copy
    // we just created a new bookshop just by getting it values from the
    // previous obj instaed of getting from the database
    //shallow copy:if i make changes in one object liek removing an elemeent in the list
    //it will reflect in the other 
    //deep copy:it makes completely new object 
    return newBook;
    
  }
  
}
