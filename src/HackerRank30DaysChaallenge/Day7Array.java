package HackerRank30DaysChaallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Day7Array {

//    public static void reverseArray(int arr[]){
//
//        if(arr.length<=1){
//            System.out.println(Arrays.toString(arr));
//        }
//        else {
//            for(int i=arr.length-1; i>=0; i--){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }

    public static void reverseArray(int arr[], int n) {
        if (arr.length <= 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        reverseArray(arr, n);
    }

    public static void main1(String[] args) {
        //reverseArray(4);
    }
}
