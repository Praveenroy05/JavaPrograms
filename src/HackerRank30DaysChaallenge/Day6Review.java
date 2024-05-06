package HackerRank30DaysChaallenge;

import java.util.Scanner;

public class Day6Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int noOfTest = scan.nextInt();


        String str = scan.nextLine();
        String str1 = "", str2 = "";

        for (int i = 0; i < noOfTest; i++) {

            str = scan.next();

            for (int j = 0; j < str.length(); j++) {

                if (j % 2 == 0) {
                    str1 = str1 + str.charAt(j);
                } else {
                    str2 = str2 + str.charAt(j);
                }
            }
            System.out.println(str1 + "  " + str2);
            str1 = str2 = "";

        }

    }
}

