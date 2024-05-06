package HackerRank30DaysChaallenge;


import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
     int size;
     int max= Integer.MIN_VALUE;
     int min= Integer.MAX_VALUE;

    public Difference(int[] elements) {
        this.elements = elements;
        size= elements.length;

    }

   

    public void computeDifference(){
        for(int i=0; i<size; i++){
           if(min>elements[i]){
               min=elements[i];
           }
           if(max<elements[i]){
               max= elements[i] ;
           }
        }
        maximumDifference= max-min;
     //   System.out.println(maximumDifference);
        
    }
    // Add your code here

} // End of Difference class

public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
