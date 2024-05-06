package Programs;

import java.util.ArrayList;

public class FibonacciSeries {
    private static int sum;
    private static int t1 = 0;
    private static int t2 = 1;
    private static int maxSum =0;

    public static void fibonacci1(int num) {

        if (num <= 1) {
            System.out.println(num);
        }
        for (int i = 2; i <= num; i++) {
            maxSum += t1;
            System.out.print(t1 + " ");
            sum = t1 + t2;//1 2 3 5
            t1 = t2; // 1 // 1 2 3
            t2 = sum; // 1 // 2 3 5
        }
        System.out.println();
        System.out.println(maxSum);
    }

    public static void fibonacci2(int num) {

        if (num <= 1) {
            System.out.println(0);
        }
        if (num > 1) {

            sum = t1 + t2;
            System.out.print(" " + sum);

            t1 = t2;
            t2 = sum;
            fibonacci2(num - 1);
        }


    }

    public static void fibonacci3(int num) {


        ArrayList<Integer> array = new ArrayList<Integer>();

        int t1 = 0;
        int t2 = 1;
        int sum = 0;
        array.add(0);
        array.add(1);
        System.out.print(array.get(0) + " " + array.get(1));

        for (int i = 2; i <= num; i++) {
            sum = (array.get(i - 1)) + (array.get(i - 2));
            array.add(sum);
        }
        for (int i = 2; i < array.size(); i++) {
            System.out.print(" " + array.get(i));
        }
    }

    public static void main(String[] args) {
        fibonacci1(10);
        System.out.println("\n********************");
//        System.out.print(t1 + " " + t2);

      //  fibonacci2(10 );
     //   fibonacci3(10);
        int n=10;
        for(int i=0; i<n; i++) {
            System.out.print(fibonacci4(i) + " ");
        }

    }

    public static int fibonacci4(int num) {
        if(num<0){
            return -1;
        }
        if(num==0 || num==1){
            return num;
        }
        return fibonacci4(num-1)+fibonacci4(num-2);
    }

    }
