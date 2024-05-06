package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[] array = removeDuplicates(new int[]{1,2,4,5,3,6,2,3,4,});
        System.out.println(Arrays.toString(array));
        removeDup();
    }

    public static void removeDup(){
        Integer[] arrayWithDuplicates = {1,2,4,5,3,6,2,3,4,};

        // Convert the array to a LinkedHashSet to remove duplicates and maintain order
        Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(arrayWithDuplicates));

        // Convert the Set back to an array
        Integer[] arrayWithoutDuplicates = uniqueSet.toArray(new Integer[0]);

        // Print the array without duplicates
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
}
