package solid.iteratorPattern;

public class Client {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book(270, "JOSE SILVA", "THE SILVA MIND CONTROL METHOD"));
        lib.add(new Book(480, "NAPOLEON HILL", "THINK AND GROW RICH"));
        lib.add(new Book(510, "JAMES CLEAR", "ATOMIC HABITS"));

        Iterator iterator = lib.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("BOOK PRICE: " + book.getPrice() + " AUTHOR: "
                    + book.getAuthor() + " NAME: " + book.getBookName());
        }
    }
}
