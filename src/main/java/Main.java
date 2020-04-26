public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Alice in Wonderland", "Lewis Carroll", 100, 60);
        Book book2 = new Book("The Little Mermaid ", "Hans Christian Andersen", 110, 70);
        Marwin marwin = new Marwin("Karagandy");
        marwin.add(book1);
        marwin.add(book2);
        marwin.printAllProducts();
        marwin.sell(book1);

    }
}
