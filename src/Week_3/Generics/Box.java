package src.Week_3.Generics;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(3);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(5.9);

    }
}
