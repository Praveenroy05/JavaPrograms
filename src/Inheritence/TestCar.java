package Inheritence;

public class TestCar {

    public static void main(String[] args) {


        BMW bmw = new BMW();

        bmw.start();
        bmw.stop();
        bmw.fuel();
        bmw.theftSefaty();
        bmw.numberOfWheels();

        System.out.println("*************************");
        Car c = new BMW();
        c.start();
        c.stop();
        c.fuel();
        c.numberOfWheels();

        System.out.println("*************************");

        Car car = new Car();
        car.start();
        car.stop();
        car.fuel();
        car.numberOfWheels();



    }
}
