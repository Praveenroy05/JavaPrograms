package Programs.Programs;

interface Interface{
    int calculate(int a, int b);
}

public class FirstClass implements Interface{

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }



}
