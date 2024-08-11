package ait.app.repository;

import ait.app.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    Product save(Product product);

    Product delete(Product product);

}
