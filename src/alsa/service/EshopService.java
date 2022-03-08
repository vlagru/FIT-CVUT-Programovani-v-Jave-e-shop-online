package alsa.service;

import alsa.entity.Product;

public interface EshopService {

    void addProductToStorage(Product product);

    // eshop.addProductsToStorage([a, b, c]); - pole
    // eshop.addProductsToStorage(a, b, c); - parametru oddelene carkou
    // eshop.addProductsToStorage(a); - jeden parametr
    void addProductsToStorage(Product... products); // 'syntactic sugar', vyhodne oproti poli viz vyse

    boolean sellProduct(String name);

    boolean returnProduct(String name);


}
