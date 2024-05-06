package OOPSPart1;

public class ConstructorPart1Challeneg {

    private long accountNumber;
    private double balance;
    private String customername;
    private String email;
    private long phoneNo;


    public void setAccountNumber(long aNumber) {
        this.accountNumber = aNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customername = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(long phNumber) {
        this.phoneNo = phNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customername;
    }

    public String getEmail() {
        return email;

    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void depositeFunds(double amount) {
        if (amount < 0) {
            this.balance += 0;
        } else {
            this.balance += amount;
        }
        System.out.println(balance);

    }

    public void withdrawFunds(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds Request");
        } else if (amount < 0) {
            System.out.println("Please enter the amount greater than 0");

        } else {
            balance -= amount;
            System.out.println("Remaining balance is " + balance);
        }

    }

    public static void main(String[] args) {

        ConstructorPart1Challeneg bank = new ConstructorPart1Challeneg();
        bank.setAccountNumber(1234567890);
        bank.setCustomerName("Test");
        bank.setEmail("Test@bank.com");
        bank.setBalance(15000);
        bank.setPhoneNo(2356787240L);

        bank.withdrawFunds(21000);

        bank.depositeFunds(5000);
        bank.withdrawFunds(21000);
        bank.depositeFunds(5000);
        bank.withdrawFunds(21000);
        bank.depositeFunds(5000);
        bank.withdrawFunds(21000);
    }


}
