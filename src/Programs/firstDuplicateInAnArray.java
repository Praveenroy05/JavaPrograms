package Programs;

import java.util.HashSet;

public class firstDuplicateInAnArray {

    public static int firstDuplicateNumber(int [] a){

        // Loop through the array and make the index value to negative
        // and compare if that value again appear in the looping
        for(int i=0; i<a.length; i++){
            if(a[Math.abs(a[i])-1]<0){
                return Math.abs(a[i]);
            }
            else{
                a[Math.abs(a[i])-1]= -a[Math.abs(a[i])-1];
            }
        }
        return -1;
    }


    public static int firstDuplicateNumberON(int [] a) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            if (seen.contains(a[i])) {
                return a[i];
            } else {
                seen.add(a[i]);
            }
        }
        return -1;
    }


        public static void main(String[] args) {
        int [] a= {2, 1, 3, 5, 3, 2, 1};
        int result= firstDuplicateNumber(a);
        System.out.println(result);
        System.out.println(firstDuplicateNumberON(new int[]{2, 1, 3, 5, 3, 2, 1}));
    }
}
