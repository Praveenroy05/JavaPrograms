package Programs;

public class CodingExercise15Palindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number = (-1) * number;
        }

        int temp = number;
        int sum = 0;

        while (number > 0) {

          int  digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }

        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(521125);
        System.out.println(result);
    }
}
