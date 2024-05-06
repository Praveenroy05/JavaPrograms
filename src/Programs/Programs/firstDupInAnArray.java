package Programs.Programs;

public class firstDupInAnArray {

    public static int dup(int [] a){
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

    public static void main(String[] args) {
        int [] a= {1, 2, 3, 5, 7, 2, 1};
        int result= dup(a);
        System.out.println(result);
    }
}
