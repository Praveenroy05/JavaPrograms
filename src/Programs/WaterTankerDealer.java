package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WaterTankerDealer {

    public static void main(String[] args) {


        int totalWater=0;
        int totalCapacity=0;


        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();

        Integer c[]= new Integer[n];

        for(int i=0; i<n; i++){
            c[i]= scan.nextInt();
            totalCapacity+= c[i];
        }

        Arrays.sort(c, Collections.reverseOrder());

        int w[]= new int[n];

        for(int i=0; i<n; i++){
            w[i] = scan.nextInt();

                totalWater += w[i];
        }
        
                        int temp=c[0];

            for (int i = 0; i <= n-1; i++) {
                if (totalWater <= temp) {
                    System.out.println(i+1);
                    break;
                }
                else{
                    temp+=c[i+1];

                }
                
        }



    }
}
