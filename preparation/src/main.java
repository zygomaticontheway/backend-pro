import java.util.*;

public class main {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(reverse("i want cookies"));
//        fizzBuzz(32);

        int[] array = {-123, 10, 12, 1, 2, 3, 4, 5, 5, 6, 6, 7};
        int[] pairedArray = {2, 2, 8, 8, 5, 6, 6, 7, 5, 7, 8,6};
        int [] missingNrArray = {2, 4, 3, 6, 1, 0};

//        System.out.println(secondLargestNumber(array));
//
//        System.out.println(removeDuplicates("aAnttttOn"));
//
//        System.out.println("Solution = " + solution(array));
//
//        System.out.println(binaryGap(66561));
//
//        System.out.println(Arrays.toString(arrayTurning(array, 29)));
//
//        System.out.println("Unpaired element: " + unpairedElement(pairedArray));
//
//        System.out.println("Frog needs " + frogJmp(10, 85, 300) + " jumps" );

//        System.out.println("missingNr: " + missingNr(missingNrArray));

//        System.out.println( frogRiverOne(3,array) ==-1 ? "Not enough leaves" : "Frog needs " + frogRiverOne(3,array) + " seconds to jump to the other side");


    }

    public static long factorial(int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    //Task 4: Count Vowels
    //Write a function that takes a string and returns the number of vowels (a, e, i, o, u, case-insensitive).

    public static int vowels(String word) {
        int result = 0;

        char[] chars = word.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result++;
            }
        }

        return result;
    }

    //Task 5: Find the Largest Number in an Array
    //Write a function that takes an array of integers and returns the largest number.
    public static int largestNumber(int[] array) {
        int result = array[0];

        for (int i : array) {
            result = result < i ? i : result;
        }

        return result;
    }

    //Task 7: Find the Second Largest Number
    //Write a function that takes an array of integers and returns the second largest number.
    public static int secondLargestNumber(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain more than 1 element");
        }

        return Arrays.stream(array).sorted().toArray()[array.length - 2];
    }

    //Task 8: Remove Duplicates from a String
    //Write a function that removes duplicate characters from a string while keeping the first occurrence.
    public static String removeDuplicates(String string) {

        if (string == null || string.equals("")) {
            throw new IllegalArgumentException("Argument is empty");
        }
        char[] chars = string.toCharArray();

        String res = "";

        for (char i : chars) {
            //TODO
        }

        return res;
    }

    //codility.com

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
    public static int solution(int[] A) {

        if (A == null) {
            throw new IllegalArgumentException("Argument is empty");
        }
        A = Arrays.stream(A).sorted().toArray();
//        printArray(A);
        int res = 1;
        for (int x : A) {
            if (x == res) {
                res += 1;
            }
//            System.out.println(res);
        }

        return res;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.print("]");
    }

    // End of SOLUTION task.

    /*
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
Write a function:
    class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
     */
    public static int binaryGap(int N) {
        // Implement your solution here
        if (N <= 0) {
            throw new IllegalArgumentException("Argument must be greater than 0");
        }

        int maxGap = 0;
        int gapCounter = 0;
        boolean started = false;

        //1. make the number binary
        String binary = Integer.toBinaryString(N);
        System.out.println("Chars are [" + binary + "]");
        char[] chars = binary.toCharArray();

        //2. check all gaps and rewrite var maxGap
        for (char i : chars) {
            if (i == '1') {
                    started = true;
                    if (maxGap <= gapCounter) {
                        maxGap = gapCounter;
                    }
                gapCounter = 0;
            }
            if (i == '0') {
                gapCounter++;
            }
        }
        return maxGap;
    }

    /*
    Write a function:
    class Solution { public int[] solution(int[] A, int K); }
that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given
    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]

    Assume that:
        N and K are integers within the range [0..100];
        each element of array A is an integer within the range [−1,000..1,000].
     */
    public static int[] arrayTurning (int[] A, int K) {
        if (K < 0 || K > 100) {
            throw new IllegalArgumentException("Rotate amount is out of range");
        }
        if (A == null || A.length == 0) {
            return A;
        }

        int [] newA = new int[A.length];
        int offset = K % A.length;

        for (int i = 0; i < A.length; i++){
            int index = i + offset;
            int newIndex = (index < A.length ?  index : index - A.length);
            newA[newIndex] = A[i];
        }
        return newA;
    }

    /*
    Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
For example, given array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.
     */

    public static int unpairedElement (int [] A){
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException("The Array is empty");
        }

        if (A.length == 1) {
            return A[0];
        }
        if (A.length == 2) {
            return -1;
        }

        int[] sortedArray = Arrays.stream(A).sorted().toArray();

        for( int x : sortedArray ) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < sortedArray.length -2; i++) {
            if (sortedArray[i] != sortedArray[i+1]){
                return sortedArray[i];
            }
            i++;
        }
        return sortedArray[sortedArray.length-1];
    }

    /*
    A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
Count the minimal number of jumps that the small frog must perform to reach its target.
Write a function:
    class Solution { public int solution(int X, int Y, int D); }
that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
     */
    public static int frogJmp(int X, int Y, int D) {

        int distance = Y - X;

        if (D <= 0){
            throw new IllegalArgumentException("Frog is dead, it can't jump");
        }

        if (distance <=0) {
            return 0;
        }

//        System.out.println("distance: " + distance);
        double clearJumps = (double) distance / D;
//        System.out.println("clearJumps: " + clearJumps);
        // не сработало
        //        int jumps = ((distance % D) + distance) / D;
//        int restDiv = distance % D;
//        System.out.println("restDiv: " + restDiv);
//        System.out.println("From " + X + " to " + Y + " with power " + D);

        return (int) Math.ceil(clearJumps);
    }
    /*


An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].
     */
    public static int missingNr (int[] A){

        if (A == null || A.length == 0 || A.length == 1){
            return 1;
        }

        int N = A.length;
        long totalSum = (long)(N + 1) * (N + 2) / 2;
        System.out.println("totalSum: " + totalSum);

        long arraySum = 0;
//        long arraySum = Arrays.stream(A).sum();
        for (int value : A) {
            arraySum += value;
        }
        System.out.println("arraySum: " + arraySum);

        return (int)(totalSum - arraySum);
    }

    /*
    1: OddOccurrencesInArray
    Дан массив A из N целых чисел.
    Все элементы встречаются чётное число раз, кроме одного, который встречается нечётное количество раз.
    Найти этот единственный элемент.
    Пример
    A = [9, 3, 9, 3, 9, 7, 9] → вернуть 7
     */
//    Оптимальное решение (XOR):
    public int oddOccurrencesInArray(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num; // побитовая операция XOR
        }
        return result;
    }

    /*
    2: TapeEquilibrium
    Дан массив A длины N.
    Нужно найти минимальную разницу между суммами двух частей массива при любом разбиении:
        левая часть A[0..P-1]
        правая часть A[P..N-1]
    вернуть минимальную разницу.
     */
    public int TapeEquilibrium(int[] A) {
        long totalSum = Arrays.stream(A).sum();
        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            long rightSum = totalSum - leftSum;
            long diff = Math.abs(leftSum - rightSum);
            minDiff = Math.min(minDiff, diff);
        }
        return (int)minDiff;
    }

    /*
FrogRiverOne
    A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
For example, you are given integer X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
Write a function:
    class Solution { public int solution(int X, int[] A); }
that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
If the frog is never able to jump to the other side of the river, the function should return −1.
Write an efficient algorithm for the following assumptions:
        N and X are integers within the range [1..100,000];
        each element of array A is an integer within the range [1..X].
     */

    public static int frogRiverOne(int X, int[] A) {
        if (A == null || A.length ==0 || X <= 0){
            return -1;
        }

        int minTime = -1;

        //1. All leaves are in template Array
        //2. index of element, equals X <= max index of elements

        List<Integer> templateArray = new ArrayList<>();
        for (int i = 0; i < X; i++) {
            templateArray.add(i+1);
        }
        for (int i = 0; i < A.length; i++) {
            if (templateArray.isEmpty()) {
                break;
            }
            if (templateArray.contains(A[i])){
                minTime = i;
//                System.out.println("min time: " + minTime);
                templateArray.remove(Integer.valueOf(A[i]));
//                System.out.println(templateArray);
            }
        }
        if (!templateArray.isEmpty()){
            return -1;
        }
        return minTime;
    }

    // frogRiverOneByGPT => HashSet
    public int frogRiverOneByGPT(int X, int[] A) {
        Set<Integer> positions = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            positions.add(A[i]);
            if (positions.size() == X) {
                return i;
            }
        }
        return -1;
    }


}
