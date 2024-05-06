package Programs;

public class Parity {
    private static int count;
    private static int count1;


public static void divisors(int n) {
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }

        }

        System.out.println(count);
        retry(n);
    }


    public static void retry(int m){

        for(int i=1; i<=m; i++){
            if(m%i==0){
                count1++;
            }

        }
        if(count1>count){

            System.out.println(m);

        }
        else if(count1<= count){
            count1=0;
            retry(m+1);
        }
    }

    public static void main(String[] args) {
    divisors(4);
    }
}
