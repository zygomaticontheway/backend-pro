package ait.app;

import ait.app.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ait.app");
        ProductController controller = context.getBean(ProductController.class);

        System.out.println(controller.getAllProducts());
    }
}