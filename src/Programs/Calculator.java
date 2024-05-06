package Programs;

import java.util.Arrays;

/**
 * The Calculator class provides methods to get addition and subtraction of given 2 numbers.
 */
public class Calculator {
    public static int words[];
    private static int myArray;

    /**
     * The add() method returns addition of given numbers.
     */
//   public static int[] reverseARRAY(int [] a) {
//
//   int[] words= new int[a.length];
//
//       for (int i = 0, j = words.length - 1; i < a.length; i++, j--) {
//         //  System.out.print(a[i] + " ");
//           words[j]=a[i];
//       }
//       return words;
//
//   }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = reverse(new int[]{10, 20, 30, 40});
        System.out.println(String.valueOf(Arrays.toString(arr)));
    }
}
