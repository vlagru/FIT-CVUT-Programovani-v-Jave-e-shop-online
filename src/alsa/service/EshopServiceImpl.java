package alsa.service;

import alsa.entity.Product;
import alsa.persistence.Database;

public class EshopServiceImpl implements EshopService{

    // TODO je tedy mozne z interfaceu vytvorit atribut (nikoliv objekt)???!!!!!, neni immutable, protoze 'Database' lze menit
    private final Database database;

    // konstruktor k atributu
    public EshopServiceImpl(Database database) {
        this.database = database;
    }

    // TODO atribut 'database' vytvoren, aby bulo mozne pristupovat k metodam Databaze???
    @Override
    public void addProductToStorage(Product product) {
        database.saveProduct(product);
    }

    @Override
    public void addProductsToStorage(Product... products) {
        for (Product product : products) {
            addProductToStorage(product);
        }
    }

    @Override
    public boolean sellProduct(String name) {
        Product product = database.getProductByName(name);
        if(product.getCount() == 0) // TODO getCount metoda vyrvorena ze tridy Produkt???
            return false;

        // TODO dodelat tento objekt, musim nejdrive vytvorit metody pro snizeni a zvyseni poctu
        Product updatedProduct = product.withDecreasedCount();
        database.saveProduct(updatedProduct);
        return true;
    }

    // vytvorim si v Produktu abstraktni metody na ma/nema zaruku a implementuji v Notebooku a v Televison
    @Override
    public boolean returnProduct(String name) {
        Product product = database.getProductByName(name);
        if(!product.hasSpecialGuarantee())
            return false;

        Product updatedProduct = product.withIncreasedCount();
        database.saveProduct(updatedProduct);
        return true;
    }
}
