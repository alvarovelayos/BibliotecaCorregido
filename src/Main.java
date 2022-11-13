public class Main {
    public static void main(String[] args) {

        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("Accion");
        genre.setDescription("Genero de accion");

        Author author = new Author();
        author.setName("Jesus");
        author.setSurname("Navas");
        author.setCity("Dos palacios");
        author.setDateBorn("01-01-1980");

        Book book = new Book();
        book.setIsbn("ASD-DF-123");
        book.setTitle("Frankenstein y el descenso a 2");
        book.setPublisheadDate("01-01-2022");
        book.setGenre(genre);
        book.setAuthor(author);


    }
}
