package functions;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {

        boolean age1 = isTeen(first);
        boolean age2 = isTeen(second);
        boolean age3 = isTeen(third);

        if (age1 || age2 || age3) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int age) {
        if ((age >= 13 && age <= 19)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(hasTeen(10, 13, 67));
        //  System.out.println(isTeen(56));
    }

}
