package Programs;



import java.util.Arrays;
        import java.util.Map;
        import java.util.TreeMap;

public class Sorting0s1s2sETC {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 2, 4, 1, 3, 3, 3, 1, 2, 2, 2, 5, 5, 5, 6};
        int[] sortedArray = customSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] customSort(int[] arr) {
        // Step 1: Count occurrences of each unique number using TreeMap
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Reconstruct the array based on the counts
        int[] sortedArr = new int[arr.length];
        int index = 0;

        // TreeMap ensures keys are sorted
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sortedArr[index++] = key;
            }
        }

        return sortedArr;
    }
}

