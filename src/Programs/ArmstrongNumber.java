package Programs;

public class ArmstrongNumber {

    public static void armstrongNumber(int num) {
        if (num < 0) {
            System.out.println("Invalid Number");
        }

        int temp = num;
        int sum = 0;

        while(num > 0) {

           int cube = num % 10;//3
            sum = sum + (cube * cube * cube);

            num = num / 10;

        }

        if (sum == temp) {
            System.out.println(sum + " Is an Armstrong Number");
        } else {
            System.out.println(sum + " Is not an Armstrong Number");

        }
    }

    public static void main(String[] args) {
        armstrongNumber(153);
    }
}
