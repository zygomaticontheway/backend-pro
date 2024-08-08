import java.util.List;

public class DividedOnTwo extends Thread{
    private List<Integer> numbers;
    private List<Integer> result;

    public DividedOnTwo(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        result = numbers.stream()
                .filter(number -> number %2 == 0)
                .toList();

        System.out.println("--- numbers, divided on 2");

        for (Integer number : result) {
            System.out.println(number);
        }
    }
}
