import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("1qweqwe", "2dsdfsdf", "3fdsfsdff", "4xzcvvvgf");

        Map<String, String> res1 = list.stream().collect(Collectors.toMap(s -> s, s -> s.toUpperCase()));

        System.out.println(res1);

        List<Person> people = List.of(
                new Person("Ad", 21),
                new Person("Bill", 22),
                new Person("Cony", 32),
                new Person("Denis", 33),
                new Person("Egor", 43),
                new Person("Forest", 3),
                new Person("Garry", 53),
                new Person("Hugo", 53),
                new Person("Ingrid", 93),
                new Person("Jorg", 73)
        );

        // сгруппировать по возрасту
        Map<Integer, List<Person>> res = people.stream().collect(Collectors.groupingBy(p -> p.getAge()));
        System.out.println(res);

        //downstream
        Map<Boolean, List<Person>> res2 = people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 25));
        System.out.println(res2);

        Map<Boolean, Set<Person>> res3 = people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 25, Collectors.toSet()));
        System.out.println(res3);

        Map<Boolean, Long> res4 = people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 25, Collectors.counting()));
        System.out.println(res4);

        Map<String, List<Person>> m1 = people.stream().collect(Collectors.groupingBy(p -> p.getName()));

        HashSet collect = people.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> new HashSet()));
        System.out.println("========" + '\n' + collect);


        List<Person> collect1 = people.stream().collect(Collectors.toList());
        System.out.println("COLLECT1: " + collect1);


        List<Person> collect2 = people.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list1 -> list1.stream().filter(p -> p.getAge() > 23).toList()));
        System.out.println("COLLECT2: " + collect2);
//        List<Person> people2 = res2.get(true);
//        System.out.println("========" + '\n' + people2);

    }
}