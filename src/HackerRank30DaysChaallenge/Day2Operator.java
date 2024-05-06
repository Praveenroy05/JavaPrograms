package HackerRank30DaysChaallenge;

import java.util.Scanner;

public class Day2Operator {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double total_meal_cost = meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100);

        System.out.println(Math.round(total_meal_cost));

//        System.out.println(meal_cost);
//        System.out.println(tip_percent);
//        System.out.println(tax_percent);
//
//
//        double tip_value= (double)((meal_cost) * (tip_percent/100));
//
//        System.out.println(tip_value);
//
//        double tax_value= (meal_cost * tax_percent)/100;
//
//        System.out.println(tax_value);
//
//        double total_meal_cost= meal_cost + tip_value + tax_value;
//
//        System.out.println(total_meal_cost);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}
