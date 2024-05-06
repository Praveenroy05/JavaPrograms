package Programs;

public class SquareRoot {

    public static void main(String[] args) {
       double result= squareRoot(25);
        System.out.println(result);
    }

    public static double squareRoot(int n){
        if(n<=0){
            return -1;
        }
        else{
            return Math.sqrt(n);
        }
    }
}
