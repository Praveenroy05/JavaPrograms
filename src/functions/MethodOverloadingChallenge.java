package functions;

public class MethodOverloadingChallenge {

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {

        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid Value");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters = centimeters + (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {

        if (inches < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to  " + feet + " feet " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeter(6, 5);
        calcFeetAndInchesToCentimeter(100);

    }
}
