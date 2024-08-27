package ait.builderdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import main.java.ait.builderdemo.Person;

@SpringBootApplication
public class BuilderDemoApplication {
	public static void main(String[] args) {
		Person person1 = Person.builder()
				.lastName("Jackson")
				.age(51)
				.firstName("Nick")
				.phone("491599383877")
				.build();

		System.out.println(person1);

		Person person2 = Person.builder()
				.firstName("John")
				.lastName("Johnson")
				.pet(new Pet("Tuzik"))
				.pet(new Pet("Murzik"))
				.build();
		System.out.println(person2);
	}

}
