package Programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // Check if the complement is already in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{complementMap.get(complement), i};
            }

            // Add the current number and its index to the map
            complementMap.put(currentNum, i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
