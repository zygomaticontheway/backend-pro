import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("qwe1", "qwo2asd", "qwawd");

        //String класс, в котором находится метод toUpperCase, по совместительству является типом переменной, с которой производим действия
        List<String> res1 = listHandler(list, s -> s.toUpperCase());
        List<String> res3 = listHandler(list, String :: toUpperCase);

        List<String> res2 = listHandler(list, s -> s.substring(2));
        System.out.println(res1);
        System.out.println(res2);


        List<Integer> res4 = listHandler2(list, s -> s.length());
        List<Integer> res5 = listHandler2(list, String::length);
        System.out.println(res4);

        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("John", 20),
                new Person("Milena", 30),
                new Person("Anna", 15),
                new Person("Mina", 19),
                new Person("Octopus", 9)
        );

        List<Integer> ageOfPersons = people.stream()
                .map(Person::getAge)
                .toList();

        int sum = people.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .sum();

        Optional<Integer> reduce = people.stream()
                .map(Person::getName)
                .map(String::length)
                .reduce(Integer::sum);

        System.out.println("------");
        System.out.println(ageOfPersons);
        System.out.println(sum);
        System.out.println(reduce);

    }

    public static List<String> listHandler(List<String> list, Function<String, String> func){

        List<String> result = new ArrayList<>();

        for (String str : list){
            result.add(func.apply(str));
        }
        return result;
    }

    public static List<Integer> listHandler2(List<String> list, Function<String, Integer> func){

        List<Integer> result = new ArrayList<>();

        for (String str : list){
            result.add(func.apply(str));
        }
        return result;
    }
}