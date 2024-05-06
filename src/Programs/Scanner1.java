package Programs;

import java.util.Scanner;

public class Scanner1 {


//    public static void main(String[] args) {
//        int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Integer variable");
//        int i1 = sc.nextInt();
//
//        System.out.println("Enter double variable");
//        double d1 = sc.nextDouble();
//        System.out.println("Enter String variable");
//
//        String s1 = sc.nextLine();
//
//        s= s.concat(s1);
//
//        System.out.println(i + i1);
//        System.out.println(d + d1);
//        System.out.println(s);

    public static void main(String args[]) {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First String : ");
        int a = scan.nextInt();
        //  scan.close();
        System.out.print("Enter Second String : ");
        String str3 = scan.next();
        str2 = scan.nextLine();

        System.out.print("Concatenating String 2 into String 1...\n");
        str1 = a + str3.concat(str2);

        System.out.print("String 1 after Concatenation is " + str1);
    }



    /* Declare second integer, double, and String variables. */

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

    /* Print the sum of both integer variables on a new line. */

    /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

}

