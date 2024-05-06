package HackerRank30DaysChaallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day10BinaryNumber {
    public static void binaryNumber(int number) {

        List<Integer> list = new ArrayList<Integer>();

        int count = 0, max = 0;
        int digit = 0;

        while (number > 0) {

            digit = number % 2;// Reminder 10/2= 0, 5/2 =1, 2/2=0, 1/2=1
            System.out.print(digit);

            if (digit == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
            number = number / 2;// left number

            list.add(digit);

        }

        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        binaryNumber(n);
    }
}

