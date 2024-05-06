package Programs;

public class SumOfDigits {

    public static int sumOfDigits(int number) {

        int sum = 0;
        int temp = 0;

        if (number < 10) {
            return number;
        } else {
            while (number != 0) {
                temp = number % 10;
                sum = sum + temp;
                number = number / 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumOfDigits(987);
        System.out.println(result);
        int result1 = sumOfDigits(9);
        System.out.println(result1);
    }
}
