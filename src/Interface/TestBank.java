package Interface;

public class TestBank {

    public static void main(String[] args) {
        HSBC hb= new HSBC();
        hb.credit();
        hb.debit();
        hb.deposit();
        hb.transfer();
        hb.dollar();
        hb.rupees();
        hb.withdrawn();
        hb.loan();
        hb.Default();
        USBank.Static();
        System.out.println("************************");
        Bank b= new HSBC();
        b.dollar();
        b.rupees();
        b.credit();
        b.debit();
        b.deposit();
        b.loan();
        b.Default();
        System.out.println(HSBC.test);
        System.out.println("************************");

        USBank u= new HSBC() ;
        u.credit();
        u.debit();
        u.deposit();
        u.Default();
        USBank.Static();







    }
}
