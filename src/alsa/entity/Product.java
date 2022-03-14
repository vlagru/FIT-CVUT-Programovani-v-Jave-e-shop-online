package alsa.entity;

public abstract class Product {

    // musim zmenit z PRIVATE na PROTECTED, aby bylo videt i v jine tride
    protected final String name;
    protected final double price;
    protected final int count;

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

    public abstract Product withIncreasedCount();
    public abstract Product withDecreasedCount();
    public abstract boolean hasSpecialGuarantee();
}
