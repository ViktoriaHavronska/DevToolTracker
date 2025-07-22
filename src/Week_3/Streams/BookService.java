package src.Week_3.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books = new ArrayList<>();

    //addBook(Book book)
    public void addBook(Book book) {
        books.add(book);
    }

    //findByAuthor(String author)
    public Book findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .findFirst()
                .orElse(null);
    }

    //findByGenre(Genre genre)
    public List<Book> findByGenre(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre() == genre)
                .collect(Collectors.toList());
    }

    //getNewestBook()
    public Book getNewestBook() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getYear))
                .orElse(null);
    }

    //sortBooksByTitle()
    public void sortBooksByTitle() {
        books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);
    }

    //printAllBooks()
    public void printAllBooks() {
        books.forEach(System.out::println);
    }
}
