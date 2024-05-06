package Programs;

import java.util.Arrays;
import java.util.Collections;

public class NearestPalindrome {

    static int closestPalindrome(int n)
    {
        int low = n-1;

        // will decrease the low till low is a palindrome
        while(!checkPalindrome(low)) {
            low -= 1;
        }

       int  high = n + 1;

        // will increase the high till high is a palindrome
        while(!checkPalindrome(high)) {
            high += 1;
        }

        // checking difference between both
        if ( n - low < high - n)
            return low;
        else
            return high;
    }
    static boolean checkPalindrome(int num) {
        int temp = 0;
        int sum = num;

        while (num > 0) {
            temp = (temp * 10) + (num % 10); //1
            //  sum= temp+ (num %10);
            num = num / 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int result= closestPalindrome(157);
        System.out.println(result);
        int var = 157;
        System.out.println("Finding nearst palindrome "+ findNearestPalindrome(var));
    }

    public static boolean ifPalindrom(int var){

        String temp = var+"";

        String reverse = "";

        for (int i = temp.length() - 1; i >= 0; i--) {
            reverse = reverse + temp.charAt(i);

        }

        if ( temp.equals(reverse)){
            return true;
        }
        return false;
    }


    public static int findNearestPalindrome(int x){

        int temp = 0;                                     // 131
        while (temp <= x)                                  // 125, 126, 124, 127, 123, 128, 122, 129, 121
        {
            if(ifPalindrom(x + temp)){                   //  ifPalindrom(125)
                return (x + temp);
            }
            if(ifPalindrom(x - temp)){
                return (x - temp);
            }
            temp++;
        }
        return -1;
    }



}
