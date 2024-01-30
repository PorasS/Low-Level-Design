package solid.iteratorPattern;

public class Book {
    private int price;
    private String author;
    private String bookName;

    public Book(int price, String author, String bookName) {
        this.price = price;
        this.author = author;
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }
}
