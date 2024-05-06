package Inheritence;

public class BMW extends Car{

    @Override
    public void start() {
        System.out.println("BMW --> Start");
    }

    public void theftSefaty(){
        System.out.println("BMW --> TheftSefaty");
    }
}
