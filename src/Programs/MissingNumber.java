package Programs;

public class MissingNumber {

    public static int missingNumber(int[] nums, int n) {

        int sum=0;
        for(int i=0; i<n; i++){
            sum= sum+nums[i];
        }

        return (n*(n+1)/2 - sum);

    }

    public static void main(String[] args) {
        int missingNumber = missingNumber(new int[]{9,6,4,2,3,5,7,0,1}, 9);
        System.out.println(missingNumber);
    }
}
