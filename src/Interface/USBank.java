package Interface;

public interface USBank {

    int test = 15;

    public void credit();
    public void debit();
    public void deposit();

    default void Default(){
        System.out.println(test);
        Private();
    }

    static void Static(){
        System.out.println("Static Method");
    }

    private void Private(){
        System.out.println("Private Method");
    }

}
