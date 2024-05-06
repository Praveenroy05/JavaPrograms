package Programs;

import java.util.Scanner;

public class MinimumMaximum {

    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by
     * summing exactly four of the five integers. Then print the respective minimum and maximum values as a
     * single line of two space-separated long integers.
     * Sample Input
     * 1 2 3 4 5
     * Sample Output
     * 10  14
     *
     */


    static void miniMaxSum(int[] arr) {

        // Assign the minimum and max value
        int minValue= Integer.MAX_VALUE;
        int maxValue= Integer.MIN_VALUE;
        int sum=0;

        // Calculate the sum and minimum and maximum values from all the integer values

        for(int i=0; i<arr.length; i++){

            if(arr[i]<minValue){
                minValue= arr[i];
            }
            if(arr[i]>maxValue){
                maxValue= arr[i];
            }

            sum += arr[i];


        }

    // Print the minimum and maximum value by summing the 4 integers out of 5 integers.
        System.out.println((sum-maxValue) +" "+ (sum-minValue));


    }
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] arr = new int[5];

        // Enter the 5 integer value with a space separated using keyboard keys

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
