package alsa.entity;

public abstract class Product {

    private final String name;
    private final double price;
    private final int count;

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count; // count by se takto nemel pridavat, tj. primo do abstraktni tridy
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
