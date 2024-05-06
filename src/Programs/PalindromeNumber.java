package Programs;

public class PalindromeNumber {

    public static void palindromeNumber(int num) {

        int temp = 0;
        int sum = num;

        System.out.println(num);

        while (num > 0) {

            temp = (temp * 10) + (num % 10); //1

            //  sum= temp+ (num %10);
            num = num / 10;


        }

        if (sum == temp) {
            System.out.println(sum + " Is a Palindrome Number");
        } else {
            System.out.println(sum + " Is not a Palindrome Number");

        }


    }


    public static void palindromeString1(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " Is a Palindrome String");
        } else {
            System.out.println(str + " Is not a Palindrome String");

        }
    }

    public static void palindromeString2(String str) {

        int length = str.length();
        boolean flag = true;

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                flag = false;
            }

        }
        if(flag) {
            System.out.println(str + " Is a Palindrome String");
        }else {
            System.out.println(str + " Is not a Palindrome String");

        }


    }

    static boolean palindromeString3(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public static void palindromeString4(String s)
    {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equals(reverse))
            System.out.println("Yes");

        else
            System.out.println("No");
    }







    public static void main(String[] args) {
        palindromeNumber(151);
        palindromeString1("abbccbba");
        palindromeString2("BABBAB");

    }
}
