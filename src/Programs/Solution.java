package Programs;

public class Solution {

        public static int findNearestPalindrome(int numberEntered) {
            int lowerPalidrome = getLowerPalindrome(numberEntered);
            int higherPalindrome = getHigherPalindrome(numberEntered);
            if (Math.abs(numberEntered - lowerPalidrome) < Math.abs(numberEntered - higherPalindrome)) {
                return lowerPalidrome;
            }
            else {
                return higherPalindrome;
            }
        }

        public static int getLowerPalindrome(int baseNumber) {
            int temp = 0;
            int sum = baseNumber;
            for (int i = baseNumber; i > 0; i--) {

                while (baseNumber > 0) {

                    temp = (temp * 10) + (baseNumber % 10); //1

                    //  sum= temp+ (num %10);
                    baseNumber = baseNumber / 10;


                }
            }
            System.out.println(sum);
            System.out.println(temp);
            if (temp == sum)
                //  System.out.println("Palindrome");
                return sum;
            else
                return getHigherPalindrome(sum--);
        }


        public static int getHigherPalindrome(int baseNumber) {
            int temp = 0;
            int sum = baseNumber;
            for (int i = baseNumber; i < 500; i++) {

                while (baseNumber > 0) {

                    temp = (temp * 10) + (baseNumber % 10); //1

                    //  sum= temp+ (num %10);
                    baseNumber = baseNumber / 10;


                }



            }
            System.out.println(sum);
            System.out.println(temp);
            if (temp == sum)
                //  System.out.println("Palindrome");
                return sum;
            else
                return getHigherPalindrome(sum++);

        }

    public static void main(String[] args) {
       int result= findNearestPalindrome(123);
        System.out.println(result);
    }
}