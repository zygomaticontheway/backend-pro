import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(reverse("i want cookies"));
//        fizzBuzz(32);

        int[] array = {-123, 10, 12, 1, 2, 3, 4, 5, 5, 6, 6, 7,2,2,2,2,2,2,2,2};
        int[] array1 = {1,2,3,4,5,6,7,2};
        int[] pairedArray = {2, 2, 8, 8, 5, 6, 6, 7, 5, 7, 8,6};
        int [] missingNrArray = {2, 4, 3, 6, 1, 0};
        int [] progression = {12, 4, 6, 8, 10, 2};
        int [] cars = {0,1,1,1,0,0,1};

//        System.out.println("Sum of distincts: " + distinct(pairedArray));

        System.out.println("dominator " + dominator(array1));

//        System.out.println("passingCars opa: " + passingCars(cars));

//        System.out.println("permCheck1: " + permCheck(array));
//        System.out.println("permCheck2: " + permCheck(pairedArray));
//        System.out.println("permCheck3: " + permCheck(progression));
//        System.out.println("permCheckGPT: " + permCheckByGPT(progression));

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

    /*  PermCheck
    ПРОГРЕССИЯ: a(n) = a(1) + (n-1)*d | S(n) = (a(1)+a(n))*n/2 | d = (a(n) - a(1))/(n-1)
A non-empty array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.
    Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
For example, given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.
Given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [1..1,000,000,000].
     */

    public static int permCheck(int[] A){

        Set<Integer> uniques = new HashSet<>();
        for (int x : A){
            uniques.add(x);
        }
        if (uniques.size() < A.length){
            return 0;
        }

        int sum = Arrays.stream(A).sum();
        int min = Arrays.stream(A).min().orElse(0);
        int max = Arrays.stream(A).max().orElse(0);

        if ((min + max)*A.length/2 == sum){
            return 1;
        }

        return 0;
    }
// создать массив с индексами ибо каждый элемент
    public static int permCheckByGPT(int[] A) {
        int N = A.length;
        boolean[] seen = new boolean[N + 1]; // индексы от 1 до N

        for (int x : A) {
            if (x < 1 || x > N) {
                return 0; // элемент вне диапазона
            }
            if (seen[x]) {
                return 0; // повтор
            }
            seen[x] = true;
        }
        return 1;
    }

    /* maxCounters
You are given N counters, initially set to 0, and you have two possible operations on them:
        increase(X) − counter X is increased by 1,
        max counter − all counters are set to the maximum value of any counter.
A non-empty array A of M integers is given. This array represents consecutive operations:
        if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
        if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:
    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.
Write a function:
    class Solution { public int[] solution(int N, int[] A); }
that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
Result array should be returned as an array of integers.
For example, given:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.
Write an efficient algorithm for the following assumptions:
        N and M are integers within the range [1..100,000];
        each element of array A is an integer within the range [1..N + 1].
     */
    public int[] maxCounters(int N, int[] A){
        int [] counters = new int[N];
        int maxCounter = 0;

        for (int i : A) {
            if (1 <= i && i <= N) {
                int counterIndex = i - 1;
                counters[counterIndex] ++;
                System.out.println("[A[j]-1] " + counterIndex);
                if (maxCounter <= counters[counterIndex]) {
                    maxCounter = counters[counterIndex];
                }
            } else if (i == N + 1) {
                Arrays.fill(counters, maxCounter);
            }
        }
        
        return counters;
    }

    public int[] maxCountersByGPT (int N, int[] A){
        int[] counters = new int[N];
        int currentMax = 0;
        int lastUpdate = 0;

        for (int k : A) {
            if (k >= 1 && k <= N) {
                int index = k - 1;
                if (counters[index] < lastUpdate) {
                    counters[index] = lastUpdate;  // подтягиваем до минимального уровня
                }
                counters[index]++;
                if (counters[index] > currentMax) {
                    currentMax = counters[index];
                }
            } else if (k == N + 1) {
                lastUpdate = currentMax; // откладываем массовое обновление
            }
        }

        // окончательная синхронизация
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }
        return counters;
    }

    /* PassingCars
A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.
Array A contains only 0s and/or 1s:
        0 represents a car traveling east,
        1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
For example, consider array A such that:
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
Write a function:
    class Solution { public int solution(int[] A); }
that, given a non-empty array A of N integers, returns the number of pairs of passing cars.
The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
For example, given:
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..100,000];
        each element of array A is an integer that can have one of the following values: 0, 1.
     */

    public static int passingCars(int[] A){
        int passingCars = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0){
                int sum = Arrays.stream(A).skip(i).sum();
                passingCars = passingCars + sum;
                System.out.println("sum: " + sum);
                System.out.println("passingCars: " + passingCars);
            }
        }
//        List<Integer> nulls = Arrays.stream(A).filter().toList;

        return passingCars;
    }

    public int passingCarsByGPT(int[] A) {
        int eastCars = 0;
        int passingCars = 0;

        for (int car : A) {
            if (car == 0) {
                eastCars++;
            } else { // car == 1
                passingCars += eastCars;
                if (passingCars > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return passingCars;
    }
/*

MaxProductOfThree
Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
For example, array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:
        (0, 1, 2), product is −3 * 1 * 2 = −6
        (1, 2, 4), product is 1 * 2 * 5 = 10
        (2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.
Write a function:
    class Solution { public int solution(int[] A); }
that, given a non-empty array A, returns the value of the maximal product of any triplet.
For example, given array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [3..100,000];
        each element of array A is an integer within the range [−1,000..1,000].

** С сортировкой - порядок не важен **
Arrays.sort(A);
    int N = A.length;

    int product1 = A[N - 1] * A[N - 2] * A[N - 3];
    int product2 = A[0] * A[1] * A[N - 1];

    return Math.max(product1, product2);
** Порядок важен **
        leftMax[j-1] * A[j] * rightMax[j+1]
        leftMax[j-1] * A[j] * rightMin[j+1]
        leftMin[j-1] * A[j] * rightMax[j+1]
        leftMin[j-1] * A[j] * rightMin[j+1]

 */
public static int maxProductOfThreeByGPT (int[] A) {
        int N = A.length;
        if (N < 3) return 0; // на всякий случай, хотя по условию N >= 3

        // массивы для хранения максимума и минимума слева от позиции i
        int[] leftMax = new int[N];
        int[] leftMin = new int[N];

        leftMax[0] = A[0];
        leftMin[0] = A[0];

        for (int i = 1; i < N; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
            leftMin[i] = Math.min(leftMin[i - 1], A[i]);
        }

        // массивы для хранения максимума и минимума справа от позиции i
        int[] rightMax = new int[N];
        int[] rightMin = new int[N];

        rightMax[N - 1] = A[N - 1];
        rightMin[N - 1] = A[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], A[i]);
            rightMin[i] = Math.min(rightMin[i + 1], A[i]);
        }

        int maxProduct = Integer.MIN_VALUE;

        // перебираем центральный элемент тройки
        for (int j = 1; j <= N - 2; j++) {
            int middle = A[j];

            // четыре варианта комбинаций: (max слева)*(middle)*(max справа) и так далее
            int prod1 = leftMax[j - 1] * middle * rightMax[j + 1];
            int prod2 = leftMax[j - 1] * middle * rightMin[j + 1];
            int prod3 = leftMin[j - 1] * middle * rightMax[j + 1];
            int prod4 = leftMin[j - 1] * middle * rightMin[j + 1];

            maxProduct = Math.max(maxProduct, Math.max(Math.max(prod1, prod2), Math.max(prod3, prod4)));
        }

        return maxProduct;
    }

    /* Distinct
Compute number of distinct values in an array.
Write a function
    class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the number of distinct values in array A.
For example, given array A consisting of six elements such that:
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static int distinct (int[] A){
        return Arrays.stream(A)
                .boxed()
                .collect(Collectors.toSet())
                .size();
    }

    /*
    A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
        S is empty;
        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
        S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.
     */
        public int  Brackets (String S) {
            Stack<Character> stack = new Stack<>();
            for (char c : S.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) return 0;
                    char top = stack.pop();
                    if (!matches(top, c)) return 0;
                }
            }
            return stack.isEmpty() ? 1 : 0;
        }

        private boolean matches(char open, char close) {
            return (open == '(' && close == ')')
                    || (open == '[' && close == ']')
                    || (open == '{' && close == '}');
        }

    /* fish
        If A[P] > A[Q] then P eats Q, and P will still be flowing downstream,
        If A[Q] > A[P] then Q eats P, and Q will still be flowing upstream.
We assume that all the fish are flowing at the same speed. That is, fish moving in the same direction never meet. The goal is to calculate the number of fish that will stay alive.
For example, consider arrays A and B such that:
  A[0] = 4    B[0] = 0
  A[1] = 3    B[1] = 1
  A[2] = 2    B[2] = 0
  A[3] = 1    B[3] = 0
  A[4] = 5    B[4] = 0
Initially all the fish are alive and all except fish number 1 are moving upstream. Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too. Finally, it meets fish number 4 and is eaten by it. The remaining two fish, number 0 and 4, never meet and therefore stay alive.
     */

        public int fish (int[] A, int[] B) {
            // Implement your solution here
            Stack<Integer> stack = new Stack<>();
            int alive = 0;

            if(A.length == 0 || B.length ==0){
                return 0;
            }

            for(int i = 0; i < A.length; i++){
                if (A[i] >=0 || B[i] == 1 || B[i] == 0){
                    if (B[i] == 1){
                        stack.push(A[i]);
                    } else {
                        while (!stack.isEmpty()){
                            if (stack.peek() > A[i]){
                                break;
                            } else {
                                stack.pop();
                            }
                        }
                        if (stack.isEmpty()){
                            alive++;
                        }
                    }
                }
            }
            return stack.size() + alive;
        }

/*
 Dominator
Find an index of an array such that its value occurs at more than half of indices in the array.
 */
        public static int dominator (int[] A) {
            // Implement your solution here
            //0. find a half
            //1. stream collect the map <element, amount>
            //2. compare amounts with a half
            //3.

            int half = A.length / 2;

            Map <Integer, Long> mapCount = Arrays.stream(A)
                    .boxed()
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

            Integer dominator = null;
            int domiCounter = 0;

            for (Map.Entry<Integer, Long> entry : mapCount.entrySet()){
                if (entry.getValue() > half){
                    domiCounter ++;
                    if (domiCounter > 1){
                        return -1;
                    }
                    dominator = entry.getKey();
                }
            }
            if (dominator != null ) {
                for (int j = 0; j < A.length; j++){
                    if (A[j] == dominator){
                        return j;
                    }
                }
            }

            return -1;
        }
    /*
MaxProfit
Given a log of stock prices compute the maximum possible earning.
     */

        public int maxProfit(int[] A) {
            // Implement your solution here
            //maximal with highest index - minimal with lowest index
            int n = A.length;
            int profit = 0;
            int buyPrice = 0;
            int sellPrice = 0;

            for (int i = n-1; i >= 1; i--) {
                // System.out.println("START: ");
                // int dif = A[i] - A[i-1];
                if (sellPrice <  A[i]){
                    sellPrice = A[i];
                    buyPrice = A[i-1];
                }
                if (profit < sellPrice - A[i-1]) {
                    buyPrice = A[i-1];
                    profit = sellPrice - A[i-1];
                }
                // System.out.println("sell: " + sellPrice + " buy: " + buyPrice + " prof: " + profit );
            }

            return profit > 0 ? profit : 0;
        }

        /* MaxDoubleSliceSum
Find the maximal sum of any double slice.
A non-empty array A consisting of N integers is given.
A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.
The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].
For example, array A such that:
    A[0] = 3
    A[1] = 2
    A[2] = 6
    A[3] = -1
    A[4] = 4
    A[5] = 5
    A[6] = -1
    A[7] = 2
contains the following example double slices:
        double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
        double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
        double slice (3, 4, 5), sum is 0.
The goal is to find the maximal sum of any double slice.
Write a function:
    class Solution { public int solution(int[] A); }
that, given a non-empty array A consisting of N integers, returns the maximal sum of any double slice.


         */
        public int maxDoubleSliceSum(int[] A) {
            int N = A.length;
            int[] maxEndingHere = new int[N];
            int[] maxStartingHere = new int[N];

            // вычисляем максимальные суммы отрезков слева
            for (int i = 1; i < N - 1; i++) {
                maxEndingHere[i] = Math.max(0, maxEndingHere[i - 1] + A[i]);
            }

            // вычисляем максимальные суммы отрезков справа
            for (int i = N - 2; i > 0; i--) {
                maxStartingHere[i] = Math.max(0, maxStartingHere[i + 1] + A[i]);
            }

            // пробуем каждый Y и берём лучший результат
            int maxDoubleSlice = 0;
            for (int Y = 1; Y < N - 1; Y++) {
                int candidate = maxEndingHere[Y - 1] + maxStartingHere[Y + 1];
                maxDoubleSlice = Math.max(maxDoubleSlice, candidate);
            }

            return maxDoubleSlice;
        }
/* CountFactors
Делители
Count factors of given number n.
 */
    public int сountFactors(int N) {
        // Implement your solution here
        // int factorsAmount = 0;

        // for (int x = 1; x <= N; x++){
        //     if (N % x == 0) {
        //         factorsAmount++;
        //     }
        // }
// huge numbers
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(N); i++){
            if (N % i == 0){
                factors.add(i);
                if ( i * i != N){
                    factors.add(N / i);
                }
            }
        }

        return factors.size();
    }
/*
 MinPerimeterRectangle
Find the minimal perimeter of any rectangle whose area equals N.
 */
    public int minPerimeterRectangle (int N) {
        // Implement your solution here
        int minP = (1 + N) * 2;
        int a = 0;
        int b = 0;
        // S = a * b
        // P = 2 * (a + b)
        //1. find all int sides
        //2. compare perimeters

        // System.out.println("sqrt " + Math.sqrt(N));
        // System.out.println("minP " + minP);
        for (int i = 1; i <= Math.sqrt(N); i++){
            if (N % i == 0) {
                a = i;
                b = N / i;
                int P = 2 * (a + b);

                if (minP > P) {
                    minP = P;
                }
                // System.out.println("a:  " + a + " b: " + b + " P: " + P + '\n');
            }
        }

        return minP;
    }
/* CountNonDivisible
Calculate the number of elements of an array that are not divisors of each element.
Write a function:
    class Solution { public int[] solution(int[] A); }
that, given an array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.
Result array should be returned as an array of integers.
 */
    public int[] countNonDivisible(int[] A) {
        //Implement your solution here
        //count non divs for each unique
        //
        //put amount to array
        // 1, self, repeat

        int n = A.length;
        int counterNonDivs = A.length;
        int[] arrayCounters= new int [n];

        Set<Integer> uniques = new HashSet<>(Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[] :: new)));

        // System.out.println("uniques " + uniques.toString());

        Map<Integer, Integer> map = uniques.stream()
                .collect(Collectors.toMap(
                        u -> u,
                        u -> (int) Arrays.stream(A)
                                .filter(x -> u % x != 0)
                                .count()
                ));
        // System.out.println("map " + map.toString());

        for (int i = 0; i < n; i++){
            arrayCounters[i] = map.get(A[i]);
        }

        return arrayCounters;
    }

    class Solution {
        public int[] countNonDivisibleGPT(int[] A) {
            int N = A.length;
            int[] result = new int[N];

            int maxA = Arrays.stream(A).max().getAsInt();
            int[] count = new int[maxA + 1];

            // считаем сколько раз встречается каждое число
            for (int num : A) {
                count[num]++;
            }

            // для каждого числа посчитаем сколько у него делителей
            Map<Integer, Integer> divisorsCount = new HashMap<>();

            for (int num : countUnique(A)) {
                int sumDivisors = 0;
                int sqrt = (int)Math.sqrt(num);

                for (int i = 1; i <= sqrt; i++) {
                    if (num % i == 0) {
                        sumDivisors += count[i];
                        if (i != num / i) {
                            sumDivisors += count[num / i];
                        }
                    }
                }
                divisorsCount.put(num, sumDivisors);
            }

            // вычисляем неделители
            for (int i = 0; i < N; i++) {
                result[i] = N - divisorsCount.get(A[i]);
            }
            return result;
        }

        private Set<Integer> countUnique(int[] A) {
            Set<Integer> uniques = new HashSet<>();
            for (int num : A) {
                uniques.add(num);
            }
            return uniques;
        }
    }





}
