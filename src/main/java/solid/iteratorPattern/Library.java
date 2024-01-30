package solid.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Aggregate {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Iterator iterator() {
        return new BookIterator(books);
    }
}
