package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDigits {
    public static void main(String[] args) {
        String inputString = "abc123xyz456";

        char[] character = inputString.toCharArray();

        // Extract digits from the string
        String result1 = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isDigit(c)) {
                result.append(c);
                result1+=c;
            }
        }

        // Print the result
        System.out.println("Digits extracted: " + result.toString());
        System.out.println("Digits extracted1: " + result1.toString());


        extractDigit();
        digitCount("abc123xyz456");
    }

    public static void extractDigit(){
        String inputString = "abc123xyz456";

        // Use a regular expression to match digits
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(inputString);

        // Iterate through the matches and build the result
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }

        // Print the result
        System.out.println("Digits extracted: " + result.toString());
    }

    public static void digitCount(String str){
        String digit="";
        for(char c: str.toCharArray()){
        //    char ch = str.charAt(i);
            if(Character.isDigit(c)){
                digit+=c;
            }
        }
        System.out.println(digit);
    }

}


