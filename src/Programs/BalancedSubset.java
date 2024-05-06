package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BalancedSubset {

    public static void numbers(int [] arr){

        int length= arr.length;
     //   int length1= arr1.length;
        List<Integer> list= new ArrayList<Integer>();
        int count=0;
        int splCount=0;

            for( int j=0; j< length; j++){
                for(int i=0 ;i <length; i++){
                    if(arr[i] % arr[j]==0){
                    count++;
                }

            }
                if(arr[j]==count){
                 //   System.out.println("Special Number is "+ arr[j]);
                    list.add(arr[j]);
                    System.out.println(list.get(0));
                    splCount++;
                }
                count=0;
        }
            if(splCount==0){
                System.out.println("-1");
            }

            if(splCount>1){
                Arrays.sort(list.toArray());
                System.out.println(list.get(list.size()-1));
            }

    }


    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();

        int A[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            A[i] = s.nextInt();
        }




        numbers(A);

    }
}
