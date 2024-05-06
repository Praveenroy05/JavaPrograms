package Programs;

import java.util.Arrays;

public class CountOfNumberAndString {


    public static void optimize(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int num = 0;

        for (int i = 0; i < x.length(); i++) {

            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            }

        }

        System.out.println("Numeric :" + num + "\nNon-Numeric :" + letter);

    }

    public static void digitCount(String str){
        String digit="";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                digit+=ch;
            }
        }
        System.out.println(digit);
    }


    public static void main(String[] args) {
        String Array[] = new String[]{"Pune", "Mumbai", "987", "9876", "hagsd", "ad", "345"};
        optimize("wertyu3456jhgfd@#$%^");
        optimize(Arrays.toString(Array));
        digitCount("wertyu3456jhgfd");
    }
}
