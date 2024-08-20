import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("jack", "ann", "nickolaus", "lena", "ann", "ann", "ann", "ann", "ann");

        Optional<String> s = list.stream().findAny();

        Set<String> collect1 = list.stream().collect(Collectors.toSet());

        // позволяет собрать эл-ты в любую коллекцию
        Set<String> collect2 =list.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));


        //если ключи в коллекции повторяются, то добавляется третий параметр в toMap
        Map<String, Integer> collect =  list.stream().collect(Collectors.toMap(n -> n, n -> n.length(), (v1, v2) -> v1 + v2));
        Map<Integer, String> collect3 =  list.stream().collect(Collectors.toMap(n1 -> n1.length(), n1 -> n1, (v1, v2) -> v1 + "  |  " + v2));
        System.out.println(collect);
        System.out.println(collect3);

        System.out.println(list.stream().collect(Collectors.joining("-", "<", ">")));



    }




}