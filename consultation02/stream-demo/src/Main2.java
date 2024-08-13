import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = List.of("jack", "anna", "lena", "klaus", "annual subscription");

        List <String> list1 = list.stream()
                .filter(s -> s.length() > 4)
                .toList();

        System.out.println(list1);

        List <String> list2 = list.stream()
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println(list2);

        List<Person> people = List.of(
                new Person("Jack", List.of("qwe", "qwa", "qwo")),
                new Person("Jack1", List.of("das", "der", "die")),
                new Person("Jack2", List.of("the", "a"))
        );

        List<String> list3 = people.stream()
                .flatMap(p -> p.getWord().stream())//мапит массив
                .toList();


        System.out.println(list3);
    }
}
