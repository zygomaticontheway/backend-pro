package ait.builderdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@ToString
public class Pet {
    private String name;
}
