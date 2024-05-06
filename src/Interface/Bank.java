package Interface;

public abstract class Bank implements USBank{

    public abstract void dollar();

    public void rupees(){
        System.out.println("Bank--> Rupees");
    }

    public void loan() {
        System.out.println("Bank--> Loan");

    }
}
