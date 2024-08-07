import java.util.List;

public class DividedOnThree extends Thread{
    private List<Integer> numbers;
    private List<Integer> result;

    public DividedOnThree(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        result = numbers.stream()
                .filter(number -> number %3 == 0)
                .toList();

        System.out.println("--- numbers, divided on 3");

        for (Integer number : result) {
            System.out.println(number);
        }
    }
}
