public class Main {
    public static void main(String[] args) {

        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("Comedia");
        genre.setDescription("Genero de comedia");

        Author author = new Author();
        author.setName("Juan");
        author.setSurname("Eslava Galan");
        author.setCity("Barcelona");
        author.setDateBorn("10-01-1990");

        Book book = new Book();
        book.setIsbn("ASD-DF-123");
        book.setTitle("Tumba ollas y hambrientos");
        book.setPublisheadDate("01-01-2022");
        book.setGenre(genre);
        book.setAuthor(author);

        User user = new User();
        user.setDni("01328721-U");
        user.setSurname("Velayos");
        user.setName("Alvaro");

        Loan loan = new Loan();
        loan.setId("1");
        loan.setDateStart("10-01-2022");
        loan.setDateEnd("20-02-2022");
        loan.setBook(book);
        loan.setUser(user);

        System.out.println(
               "Id Prestamo: " + loan.getId() + "\n"
                       + "Nombre del libro: " +loan.getBook().getTitle() + " (" + loan.getBook().getAuthor().getName() + ")" + "\n"
                       + "Usuario: " + loan.getUser().getFullName() + "\n"
                       + "Fecha de entrega: " + loan.getDateEnd()
        );




    }
}
