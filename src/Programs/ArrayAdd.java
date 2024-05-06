package Programs;

import java.util.Arrays;

public class ArrayAdd {

    public static String ArrayAdditionI(int[] arr) {
        // code goes here

        if (arr.length < 2) {
            return "false";
        }

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        int sum = 0;

     //   System.out.println(largest);

        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + arr[i];
            if (sum == largest) {

                break;

            }
        //    System.out.println(sum);
            return "true";

        }
        return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        s.nextLine();
        System.out.println(ArrayAdditionI(new int[]{5, 7, 16, 1, 2}));
        System.out.println(ArrayAdditionI1(new int[]{3, 5, -1, 8, 12}));
    }


    static String ArrayAdditionI1(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int target = A[n - 1];
        int MAX = A[0] >= 0 ? target + 1 : target + 1 + Math.abs(A[0]);
        int ZERO = A[0] >= 0 ? 0 : -A[0];
        boolean[][] D = new boolean[n][MAX];

        D[0][0] = true;
        for (int i = 0; i < n; i++) D[i][0] = true;
        D[0][ZERO] = true;
        for (int i = 0; i < n; i++) D[i][ZERO] = true;

        for (int i = 1; i <= n - 1; i++) {
            if (A[i - 1] >= 0) {
                for (int j = 1; j <= MAX - 1; j++) {
                    D[i][j] = D[i - 1][j];
                    if (j - A[i - 1] >= 0) {
                        D[i][j] |= D[i - 1][j - A[i - 1]];
                    }
                }
            } else {
                for (int j = MAX - 1 + A[i - 1]; j >= 1; j--) {
                    D[i][j] = D[i - 1][j];
                    if (j - A[i - 1] >= 0) {
                        D[i][j] |= D[i - 1][j - A[i - 1]];
                    }
                }
            }
        }
        return D[n - 1][MAX - 1] ? "true" : "false";
    }
}



