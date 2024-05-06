package OOPSPart1;

public class SimpleCalculator {

    private double firstNumber, secondNumber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double sNumber) {
        this.secondNumber = sNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubstractionResult() {
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult() {
        return secondNumber * firstNumber;
    }

    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0.0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }

    public static void main(String[] args) {
        SimpleCalculator simple = new SimpleCalculator();
        simple.setFirstNumber(15.50);
        simple.setSecondNumber(0);
        System.out.println(simple.getAdditionResult());
        System.out.println(simple.getSubstractionResult());
        System.out.println(simple.getMultiplicationResult());
        System.out.println(simple.getDivisionResult());


    }


}
