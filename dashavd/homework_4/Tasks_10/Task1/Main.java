package homework_4.Tasks_10.Task1;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Laptop("Dell XPS", 1000.0, 12);
        Device device2 = new MobilePhone("iPhone", 1200.0, "Verizon");

        device1.displayInfo();
        device1.turnOn();
        System.out.println();

        device2.displayInfo();
        device2.turnOn();
    }
}