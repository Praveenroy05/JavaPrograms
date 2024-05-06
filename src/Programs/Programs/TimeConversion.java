package Programs.Programs;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class TimeConversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.contains("AM")) {
            return s;
        } else {
            DateFormat df = new SimpleDateFormat(" hh:mm:ss aa");
            //Desired format: 24 hour format: Change the pattern as per the need
            DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
            Date date = null;
            Time time;
            String output = null;
            try {
                //Converting the input String to Date
                date = df.parse(s.replace("PM", ""));
                //Changing the format of date and storing it in String
                output = outputformat.format(date);
                //Displaying the date
                return (output);
            } catch (ParseException pe) {
                pe.printStackTrace();
            }
            return (output);


        }

    }

    public static void main(String[] args) {
        String result = timeConversion("07:05:45PM");
        System.out.println(result);
    }


    public static String formatDuration(Duration duration) {

        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        long seconds = duration.getSeconds();

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
