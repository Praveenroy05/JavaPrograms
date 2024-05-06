package ControlFlow;

public class Coding17EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        } else {
            int a = 0;
            int sum = 0;
            while (number > 0) {

                a = number % 10;
                number = number / 10;

                if (a % 2 == 0) {
                    sum = sum + a;
                }
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234234678));
    }
}
