package Programs;

public class LessNumberOfTurn {

    static int solve(int n, int p) {
        // Complete this function
        int total = n / 2;// 6
        int right = p / 2;// 3
        int left = total - right; //3
        if (right < left) {
            System.out.println("Right Returned");
            return right;
        } else {
            System.out.println("Left Returned");

            return left;
        }
    }

    public static void main(String[] args) {
        int result = solve(12, 7);
        System.out.println(result);
    }
}
