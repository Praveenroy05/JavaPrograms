package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class GoToPrime {

    public static void main(String[] args) {
        printPrimeNumber(100);

    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
