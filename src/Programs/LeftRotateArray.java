package Programs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++) {
            int temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }

        }

        return a;
    }

    static int[] rotRight(int[] a, int d) {

        for (int i = 0; i < d; i++) {
            int temp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }

        }

        return a;
    }

    public static int[] optimiseLeftRotate(int[] a, int d) {

        // Take the first starting point for rotation
        // we can take that from by modules
        int arr[] = new int[a.length];
        int mod = d % a.length;

        // now start printing the array from the d postion
        // as d is the number of rotation

        for (int i = 0; i < a.length; i++) {
            arr[i] = a[(i + mod) % a.length];
            //  System.out.print(arr+" ");
        }
        return arr;


    }

    public static int[] optimiseRightRotate(int[] a, int d) {

        // Take the first starting point for rotation
        // we can take that from by modules
        int arr[] = new int[a.length];
        int mod = a.length - d;

        // now start printing the array from the d postion
        // as d is the number of rotation

        for (int i = a.length - 1; i >= 0; i--) {
            arr[i] = a[(i + mod) % a.length];
            //  System.out.print(arr+" ");
        }
        return arr;


    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //int [] result=
        System.out.println(Arrays.toString(rotLeft(new int[]{2, 3, 4, 5, 7, 2}, 2)));
//      for(int i=0; i< result.length; i++){
//          System.out.print(result[i]);
        System.out.println(Arrays.toString(rotRight(new int[]{2, 3, 4, 5, 7, 2}, 2)));

//      }
        System.out.println(Arrays.toString(optimiseLeftRotate(new int[]{2, 3, 4, 5, 7, 2}, 2)));
        System.out.println(Arrays.toString(optimiseRightRotate(new int[]{2, 3, 4, 5, 7, 2}, 2)));

    }
}
