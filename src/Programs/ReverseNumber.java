package Programs;

public class ReverseNumber {

    public static void main(String args[]) {
        long num = 123456789;
        long reverseNumber = 0;
        long value;

        while (num > 0) {
            value = num % 10;
            reverseNumber = reverseNumber * 10 + value;
            num = num / 10;
        }
        System.out.println(reverseNumber);

        System.out.println("*******************************************");
        long num1 = 12345678;

        StringBuffer sf = new StringBuffer(String.valueOf(num1));

        System.out.println(sf.reverse());
    }
}
