package main.java.ait.builderdemo;

import ait.builderdemo.Pet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String phone;
    private String gender;
    @Singular private List<Pet> pets; //позволяет по одному создавать и добавлять сущности

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", pets=" + pets +
                '}';
    }
}
