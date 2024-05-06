package Programs;

public class FactorialNumber {

    public static void factorial(int num) {
        if (num <= 0) {
            System.out.println(1);
        }
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static int factorialRecursion(int num) {

        if (num == 0 || num ==1) {
            return 1;
        } else {

            return (num * factorialRecursion(num - 1));
        }
    }

    public static void main(String[] args) {
        factorial(5);
        int result = factorialRecursion(5);
        System.out.println(result);
    }
}
