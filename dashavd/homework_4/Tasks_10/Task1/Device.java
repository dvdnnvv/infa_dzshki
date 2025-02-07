package homework_4.Tasks_10.Task1;

abstract class Device {
    String name;
    double price;

    public Device(String name) {
        this.name = name;
        this.price = 0.0;
    }

    public Device(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("цена : " + price);
    }

    public abstract void turnOn();  // абстрактный метод
}