package Interface;

public class HSBC extends Bank implements USBank{

    @Override
    public void credit() {
        System.out.println("HSBC--> Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC--> Debit");

    }

    @Override
    public void deposit() {
        System.out.println("HSBC--> Deposit");

    }

    public void transfer(){
        System.out.println("HSBC-- > Transfer");
    }

    public void withdrawn(){
        System.out.println("HSBC-- > Withdrawn");
    }

    @Override
    public void dollar() {
        System.out.println("HSBC--> Dollar");
    }

    @Override
    public void rupees() {
        System.out.println("HSBC--> Rupees");
    }



}
