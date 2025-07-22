package src.Week_3.Streams;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        bookService.addBook(new Book("Book1", "A1", 2020, Genre.FICTION));
        bookService.addBook(new Book("Book2", "A2", 2023, Genre.HISTORY));
        bookService.addBook(new Book("Book3", "A3", 2019, Genre.BIOGRAPHY));
        bookService.addBook(new Book("Book4", "A4", 2014, Genre.SCIENCE));

        bookService.printAllBooks();

        Book found = bookService.findByAuthor("A2");

        if (found != null) {
            System.out.println("\nAuthor is found:  " + found);
        } else {
            System.out.println("\nAuthor not found");
        }

        System.out.println("\nSorted by Tittle:");
        bookService.sortBooksByTitle();

        System.out.println("\n Books SCIENCE: ");
        bookService.findByGenre(Genre.SCIENCE).forEach(System.out::println);

        System.out.println("The newest book: ");
        System.out.println(bookService.getNewestBook());
    }
}
