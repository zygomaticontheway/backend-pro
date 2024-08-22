import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] startArray = createArray(inputAmount());
        System.out.println(startArray);

        System.out.println("All possible combinations of " + startArray.length / 2 + " bracket pairs:");

        printArray(transposition(startArray));

    }

    public static int inputAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of bracket pairs");
        int amount = scanner.nextInt();

        return amount;
    }

    public static char[] createArray(int amount) {
        char[] startArray = new char[amount * 2];
        for (int i = 0; i < amount; i++) {
            startArray[i] = '(';
        }
        for (int j = amount; j < amount * 2; j++) {
            startArray[j] = ')';
        }
        return startArray;
    }

    public static List<char[]> transposition(char[] startArray) {

        List<char[]> result = new ArrayList<>();
        result.add(startArray);


        for (int i = 1; i < startArray.length; i++) {

            char[] currentArray = result.get(result.size()-1);

            System.out.println("-- i= " + i);

            if (currentArray[i] == ')') {
                int countLeftBrackets = 0;
                int countRightBrackets = 0;

                for (int j = 0; j <= i; j++) {
                    System.out.println("j = " + j);
                    if (currentArray[j] == '(') {
                        countLeftBrackets++;
                        System.out.println("~~ cL = " + countLeftBrackets);
                    }
                    if (currentArray[j] == ')') {
                        countRightBrackets++;
                        System.out.println("~~ cR = " + countRightBrackets);
                    }
                }

                System.out.println("+++counting end+++");
                for (char item : currentArray) {
                    System.out.print(item);
                }
                    System.out.println();

                if (countLeftBrackets - countRightBrackets > 0) {

                    char [] newArray = currentArray.clone();

                    char carrier = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = carrier;

                    result.add(newArray);
                }
            }
        }
        return result;
    }

    public static void printArray(List<char[]> list) {
        for (char[] item : list) {
            System.out.println(item);
        }
    }
}