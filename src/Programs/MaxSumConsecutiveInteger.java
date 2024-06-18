package Programs;

public class MaxSumConsecutiveInteger {

    public static void main(String[] args) {
        int[] array = {2, 45, 33, 56, 56, 7, 78, 89, 789, 0, 760, 55, 3};

        int maxSum = Integer.MIN_VALUE;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int sum = array[i] + array[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                startIndex = i;
                endIndex = i + 1;
            }
        }

        System.out.println("Maximum sum of consecutive integers: " + maxSum);
        System.out.println("Indexes of consecutive integers with maximum sum: [" + startIndex + ", " + endIndex + "]");
    }
}

