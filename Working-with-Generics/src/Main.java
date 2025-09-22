import checkers.CheckOdd;
import checkers.CheckPalindrome;
import checkers.CheckPrime;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> numbers = Arrays.asList(23, 12, 67, 51, 34, 15, 92, 99);

        int countOdd = CountElement.count(numbers, new CheckOdd());
        System.out.println("Total number of odd integers = " + countOdd);
        for (Integer e: numbers){
            if (new CheckOdd().test(e))
                System.out.println(e);
        }

        int countPrime = CountElement.count(numbers, new CheckPrime());
        System.out.println("Total number of prime integers = " + countPrime);
        for (Integer e: numbers){
            if (new CheckPrime().test(e))
                System.out.println(e);
        }

        int countPalindrome = CountElement.count(numbers, new CheckPalindrome());
        System.out.println("Total number of palindrome integers = " + countPalindrome);
        for (Integer e: numbers){
            if (new CheckPalindrome().test(e))
                System.out.println(e);
        }
    }
}
