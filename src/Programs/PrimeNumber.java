package Programs;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void printPrimeNumber(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        boolean result = isPrimeNumber(149);
        System.out.println(result);
        printPrimeNumber(150);

        String A= "abc";
        String B="bcd";


        A=B;

        A= "abcd";

        Integer a= new Integer(3);
        Integer b= new Integer(3);

        System.out.println(a==b);




        System.out.println(A);
        System.out.println(B);
    }


}
