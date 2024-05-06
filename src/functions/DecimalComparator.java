package functions;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number, double number2) {

        if ((int) (number * 1000) == (int) (number2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean equal = areEqualByThreeDecimalPlaces(3.244, 3.244);
        System.out.println(equal);
    }
}
