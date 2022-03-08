package alsa.persistence;

import alsa.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase implements Database {

    private final List<Product> products = new ArrayList<>();

    @Override
    public Product[] getProducts() {
        return products.toArray(new Product[products.size()]);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name))
                return product;
        }
        throw new ArrayIndexOutOfBoundsException(); // proc zde 'new'
    }
    @Override
    public void saveProduct(Product product) {
    products.removeIf(productInDb -> productInDb.getName().equals(product.getName())); // proc podtrzene
    products.remove(product);
    }

    @Override
    public void removeProduct(Product product) {
    products.remove(product);
    }
}
