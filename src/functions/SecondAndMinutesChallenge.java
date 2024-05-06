package functions;

public class SecondAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }
        int hour = minutes / 60;
        int remainngMinutes = minutes % 60;

        return hour + "h " + remainngMinutes + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainngSeconds = seconds % 60;

        return getDurationString(minutes, remainngSeconds);
    }

    public static void main(String[] args) {
        String duration = getDurationString(61, 05);
        System.out.println(duration);

        System.out.println("***********************");
        String duration1 = getDurationString(3600);
        System.out.println(duration1);

    }
}
