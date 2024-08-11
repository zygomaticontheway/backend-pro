package ait.app.service;

import ait.app.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product save (Product product);
}
