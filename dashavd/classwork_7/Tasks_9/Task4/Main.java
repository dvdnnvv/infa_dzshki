package Tasks_9.Task4;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.speedUp(50);
        car.stop();

        bike.start();
        bike.speedUp(20);
        bike.stop();
    }
}