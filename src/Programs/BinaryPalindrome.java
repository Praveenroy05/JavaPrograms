package Programs;

import java.util.ArrayList;
import java.util.List;

public class BinaryPalindrome {

    public static void binaryNumber(int number) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();


        int digit = 0;

        while (number > 0) {

            digit = number % 2;// Reminder 10/2= 0, 5/2 =1, 2/2=0, 1/2=1
            number = number / 2; // left number

            list.add(digit);

        }
        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {

            list1.add(list.get(i));


        }
        System.out.println(list1);

        if (list.equals(list1)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }


    }

    public static void main(String[] args) {
        binaryNumber(5);
    }

}
