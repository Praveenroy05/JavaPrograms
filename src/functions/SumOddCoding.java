package functions;

public class SumOddCoding {
    public static boolean isOdd(int number) {

        if (number <= 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if ((start <= 0) || (end <= 0) || (end < start)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println(i);
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumOdd(10, 20);
        System.out.println(result);
    }
}
