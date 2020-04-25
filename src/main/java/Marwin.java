import lesson.AbstractProduct;
import lesson.AbstractShop;

import java.util.ArrayList;
import java.util.List;

public class Marwin extends AbstractShop {
 private String location;
 private List<AbstractProduct> books = new ArrayList();

 Marwin(String location){
     this.location =location;
 }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void sellBook(Book book){
      books.remove(book);
      System.out.println("Book: " + book.getName() + " - was sold");
    }
}
