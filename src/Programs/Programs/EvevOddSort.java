package Programs.Programs;

import java.util.Arrays;

public class EvevOddSort {

        // To do two way sort. First sort even numbers in
        // ascending order, then odd numbers in descending
        // order.
        static void twoWaySort(int arr[], int n)
        {
            // Make all odd numbers negative
         //   Arrays.sort(arr);

            for (int i = 0; i < n; i++)
                if ((arr[i] % 2) != 0) // Check for odd
                    arr[i] *= -1;

            // Sort all numbers
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            // Retaining original array
            for (int i = 0; i < n; i++)
                if ((arr[i] %2 ) != 0)
                    arr[i] *= -1;


        }

        // Driver Method
        public static void main(String[] args)
        {
            int arr[] = { 1, 3, 2, 7, 5, 4 };

            twoWaySort(arr, arr.length);

            System.out.println(Arrays.toString(arr));
        }
    }

