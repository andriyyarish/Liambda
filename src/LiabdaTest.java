import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Andriy_Yarish on 2/18/2016.
 */
public class LiabdaTest {
    public static void main(String args[]) throws Exception {
        int num1 = 7;
        List<Integer> intlist = Arrays.asList(5, 7, 2, 6, 4);

        System.out.println(num1 + " is prime: " + LiabdaTest.isPrimeNum(num1));
        System.out.println(num1 + " is prime: " + LiabdaTest.isPrimeNumLiambda(num1));

        System.out.println("First doubled number is: " + LiabdaTest.getFirstDoubledNumber(intlist));
        System.out.println("First doubled number is: " + LiabdaTest.getFirstDoubledNumberLiambda1(intlist));
        System.out.println("First doubled number is: " + LiabdaTest.getFirstDoubledNumberLiambda2(5,7,2,6,4,56));
    }

    public static boolean isPrimeNum(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static boolean isPrimeNumLiambda(final int number) {
        return IntStream.range(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static int getFirstDoubledNumber(List<Integer> list) {
        int doubledNumber = 0;
        for (int el : list) {
            if ((el % 2 == 0) && (el > 3)) {
                doubledNumber = el;
                break;
            }
        }
        return doubledNumber;
    }

    public static int getFirstDoubledNumberLiambda1(List<Integer> list) {
        return   list.stream()
                .filter(e -> (e % 2 == 0) && (e > 3))
                .findFirst().map(i -> i * 2)
                .get();
    }

    public static int getFirstDoubledNumberLiambda2(int ... arr ) {
        return   IntStream.of(arr)
                .filter(e -> (e % 2 == 0) && (e > 3))
                .findFirst().getAsInt();
    }



}
