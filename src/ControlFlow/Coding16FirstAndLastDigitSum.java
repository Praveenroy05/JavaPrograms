package ControlFlow;

public class Coding16FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {// 245
            return -1;
        } else {
            int temp = number;
            int a = 0;
            while (number > 0) {
                // a = number / 10;
                a = number;
                number = number / 10;

            }
            int b = temp % 10;
            return a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(234));
    }
}
