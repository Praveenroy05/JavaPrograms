package Programs.Programs;

public class ThirdClass {

    private int c=2;
    private int d=3;

    public int getResult(Interface myparam){

        return myparam.calculate(c,d);
    }

    public static void main(String[] args) {
        ThirdClass t = new ThirdClass();
        Interface f= new FirstClass();
        System.out.println(t.getResult(f));
    }

}
