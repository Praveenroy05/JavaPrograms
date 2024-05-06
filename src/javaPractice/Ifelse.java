package javaPractice;

public class Ifelse {

    public static void main(String[] args) {
        maxNumber(8,12);
        nestedIfElse(8,12,13);
    }

    public static void maxNumber(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void nestedIfElse(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>c && b>a) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
