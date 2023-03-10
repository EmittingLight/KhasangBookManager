class Book {
    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book))
            return false;
        Book other = (Book) o;
        return this.isbn.equals(other.isbn);
    }

    public int hashCode() {
        return this.isbn.hashCode();
    }
}