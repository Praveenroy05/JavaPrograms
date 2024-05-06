package Programs;

public class ReverseString {

    public static void main(String args[]) {

        String s = " APPLE";
        int len = s.length();
        String reverse = "";

        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

        System.out.println(reverse.substring(0, 2) + " " + reverse.substring(1, 2));


        System.out.println("*******************************");


        String s1 = " This is what";

        String word[] = s1.split(" ");

        String revString = "";

        for (int i = 0; i < word.length; i++) {
            String words = word[i];

            String reverseWord = "";

            for (int j = words.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + words.charAt(j);

            }
            revString = revString + reverseWord + " ";

        }
        System.out.println(revString);


    }

}
