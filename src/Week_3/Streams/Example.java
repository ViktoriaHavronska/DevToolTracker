package src.Week_3.Streams;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Oleh", "David");

        names.stream()
                .filter(name -> name.startsWith("O"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
