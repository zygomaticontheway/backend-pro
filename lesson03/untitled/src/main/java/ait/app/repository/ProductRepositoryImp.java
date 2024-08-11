package ait.app.repository;

import ait.app.entity.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class ProductRepositoryImp implements ProductRepository {

    List<Product> db = List.of(
            new Product(1L, "Banana", new BigDecimal("0.90"), "art1"),
            new Product(2L, "Apple", new BigDecimal("1.90"), "art2"),
            new Product(3L, "Tomato", new BigDecimal("2.30"), "art3"),
            new Product(4L, "Milk", new BigDecimal("0.95"), "art4")
            );

    @Override
    public List<Product> findAll() {
        return db;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product delete(Product product) {
        return null;
    }
}
