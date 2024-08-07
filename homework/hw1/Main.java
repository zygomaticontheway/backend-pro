import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    Реализовать 2 потока:
//    первый поток должен выводить на экран все числа, которые делятся на 2;
//    второй поток должен выводить все числа которые делятся на 3;
//    Main должен запускать оба эти потока, засыпать на 3 секунды
//    и завершать выполнение программы (т.е. оба потока тоже должны прекратить
//    свою работу)


    public static void main(String[] args) {

        System.out.println("*** Main started");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,12,14,15,16,18);

        DividedOnTwo resultTwo = new DividedOnTwo(numbers);
        DividedOnThree resultThre = new DividedOnThree(numbers);

        resultTwo.start();
        resultThre.start();

        System.out.println("~~~Sleepy time!~~~");
        Long start = System.currentTimeMillis();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            resultTwo.join();
            resultThre.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*** Main stopped");

        Long stop = System.currentTimeMillis();

        System.out.println("Time:" + (stop - start));
    }



}
