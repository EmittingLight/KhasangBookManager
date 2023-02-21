import java.util.HashSet;
import java.util.Set;

public class BookCollection {
    private Set<Book> books;

    public BookCollection() {
        this.books = new HashSet<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean hasBook(String isbn) {
        return this.books.contains(new Book("", "", isbn));
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
