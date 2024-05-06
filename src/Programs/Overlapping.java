package Programs;

import java.util.Scanner;

public class Overlapping {

    public static boolean OverlappingRanges(int[] arr) {

        // keep a count of how many numbers overlap
        int counter = 0;

        // loop through one of the ranges
        for (int i = arr[0]; i < arr[1]; i++) {

            // check if a number within the first range exists
            // in the second range
            if (i >= arr[2] && i <= arr[3]) {
                counter += 1;
            }

        }

        // check if the numbers that overlap is equal to or greater
        // than the last number in the array
        return (counter >= arr[4]) ? true : false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }

        System.out.print(OverlappingRanges(myArray));
        //  System.out.println(OverlappingRanges(new int[] {1,8,2,4,4}));
    }

}
