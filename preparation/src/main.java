import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(reverse("i want cookies"));
        fizzBuzz(32);

        int[] array = {-123,10,12,1,2,3,4,5,5,6,6,7};

        System.out.println(secondLargestNumber(array));

        System.out.println(removeDuplicates("aAnttttOn"));

        System.out.println("Solution = " + solution(array));


    }

    public static long factorial (int a){
        long result = 1;
        for (int i = 1; i <=a; i++ ){
            result *= i;
        }

        return result;
    }

    public static String reverse (String s){
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void fizzBuzz (int n){

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    //Task 4: Count Vowels
    //Write a function that takes a string and returns the number of vowels (a, e, i, o, u, case-insensitive).

    public static int vowels (String word){
        int result =0;

        char[] chars = word.toLowerCase().toCharArray();
        for (char c : chars){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                result++;
            }
        }

        return result;
    }

    //Task 5: Find the Largest Number in an Array
    //Write a function that takes an array of integers and returns the largest number.
    public static int largestNumber (int[] array){
        int result = array[0];

        for (int i : array){
            result = result < i ?  i : result;
        }

        return result;
    }

    //Task 7: Find the Second Largest Number
    //Write a function that takes an array of integers and returns the second largest number.
    public static int secondLargestNumber (int [] array){
        if (array == null) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain more than 1 element");
        }

        return Arrays.stream(array).sorted().toArray()[array.length -2];
    }

    //Task 8: Remove Duplicates from a String
    //Write a function that removes duplicate characters from a string while keeping the first occurrence.
    public static String removeDuplicates (String string){

        if (string == null || string.equals("")){
            throw new IllegalArgumentException("Argument is empty");
        }
        char[] chars = string.toCharArray();

        String res = "";

        for (char i : chars){
            //TODO
        }

        return res;
    }

    /*
Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static int solution(int[] A){

        if (A == null){
            throw new IllegalArgumentException("Argument is empty");
        }
        A = Arrays.stream(A).sorted().toArray();
//        printArray(A);
        int res =1;
        for (int x : A){
            if (x == res) {
                res+=1;
            };
//            System.out.println(res);
        }

        return res;
    }
    public static void printArray (int [] array){
        System.out.print("[");
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.print("]");
    }

    // End of SOLUTION task.

}
