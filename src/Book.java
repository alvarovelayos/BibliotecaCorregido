public class Book {
    private String isbn;
    private String title;
    private String publisheadDate;
    private Author author;
    private Genre genre;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisheadDate() {
        return publisheadDate;
    }

    public void setPublisheadDate(String publisheadDate) {
        this.publisheadDate = publisheadDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
