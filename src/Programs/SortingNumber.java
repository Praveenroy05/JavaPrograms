package Programs;

import java.util.Arrays;

public class SortingNumber {

    public static int sortingNumber(int a[], int total) {

        int temp;
      //  System.out.println(Arrays.toString(a));

        total = a.length;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return (a[total - 3]);

    }


    public static void main(String args[]) {

        int a[] = {19, 34, 2, 78, 41, 15};

        System.out.println(sortingNumber(a, 6));
        ArraySort(new int[]{19,34,2,41,78,15});
    }

    public static void ArraySort(int[] a){
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
