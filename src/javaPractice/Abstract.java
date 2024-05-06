package javaPractice;

public abstract class Abstract {

    abstract float getInterestRate();
}

 class SBI extends Abstract{

    @Override
    float getInterestRate() {
        return 8;
    }
}

class ICICI extends Abstract{

    @Override
    float getInterestRate() {
        return 10;
    }
}

class Test{
    public static void main(String[] args) {
        Abstract a = new SBI();
        System.out.println(a.getInterestRate());
        Abstract icici = new ICICI();
        System.out.println(icici.getInterestRate());
    }
}
