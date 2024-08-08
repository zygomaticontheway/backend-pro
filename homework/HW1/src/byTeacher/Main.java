package byTeacher;

public class Main {
//    Реализовать 2 потока:
//    первый поток должен выводить на экран все числа, которые делятся на 2;
//    второй поток должен выводить все числа которые делятся на 3;
//    Main должен запускать оба эти потока, засыпать на 3 секунды
//    и завершать выполнение программы (т.е. оба потока тоже должны прекратить
//    свою работу)


    public static void main(String[] args) {

        System.out.println("*** Main started");

        DivBy2 divBy2 = new DivBy2();
        Thread divBy3 = new Thread(new DivBy3());

        divBy2.setDaemon(true);
        divBy3.setDaemon(true);

        divBy2.start();
        divBy3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*** Main stopped");

    }
}
