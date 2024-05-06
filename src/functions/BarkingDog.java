package functions;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        //   barking= false;

        if ((barking == true && hourOfDay < 0) || (barking == true && hourOfDay > 23)) {
            return false;
        } else if ((barking == true && hourOfDay < 8) || (barking == true && hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean barking = shouldWakeUp(true, 23);
        System.out.println(barking);
    }
}
