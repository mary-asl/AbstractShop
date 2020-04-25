import lesson.AbstractProduct;

public class Book extends AbstractProduct {
    String author;
    int papers;

    public Book(String name, String author, int papers, double price) {
        super(name, price);
        this.author = author;
        this.papers = papers;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPapers() {
        return papers;
    }

    public void setPapers(int papers) {
        this.papers = papers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name=" + getName() + '\'' +
                ", papers=" + papers + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
