package Programs;

import java.util.Arrays;

public class ZTest {

    public static void main(String[] args) {

       int[] input = {2,0,0,5,1,9,3,0,8,7,0,1};
       // Output - {2,5,1,9,3,8,7,1, 0,0,0,0}

        int count =0; // 7

        for(int i=0; i<input.length; i++){
            if(input[i] !=0){

                input[count++] = input[i];
            }
        }


        for(int i=count ; i<input.length; i++){

            input[i] = 0;
        }

        for (int num : input) {
            System.out.print(num + " ");
        }
    }
}
