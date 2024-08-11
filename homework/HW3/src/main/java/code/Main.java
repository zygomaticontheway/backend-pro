package code;

import code.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("code");
        BookController controller = context.getBean(BookController.class);

        System.out.println(controller.getAllBooks());
        System.out.println(controller.getBookById("978-0743273565"));
    }
}