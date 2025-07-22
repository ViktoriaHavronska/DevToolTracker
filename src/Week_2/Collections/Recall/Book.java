package src.Week_2.Collections.Recall;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private int rating;

    public Book(String title, int year, int rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Book 1", 2024, 5));
        books.add(new Book("Book 2", 2021, 3));
        books.add(new Book("Book 3", 2025, 4));

        System.out.println("Sort by Year old -> new");
        books.sort(Comparator.comparingInt(b -> b.year));
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\n Sort by Rating high -> low ");
        books.sort(Comparator.comparingInt(b -> b.rating));
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
