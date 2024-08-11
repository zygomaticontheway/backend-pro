package ait.app.controller;

import ait.app.entity.Product;
import ait.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
//https://mvnrepository.com/repos/central - склад приложений

@Component
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    };
    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }

}
