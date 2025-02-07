package homework_4.Tasks_10.Task1;

class Laptop extends Device {
    int batteryLife;

    public Laptop(String name, double price, int batteryLife) {
        super(name, price);
        this.batteryLife = batteryLife;
    }

    public Laptop(String name, int batteryLife) {
        super(name);
        this.batteryLife = batteryLife;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " Ноут включен!");
    }

    public void showBatteryLife() {
        System.out.println("Акум: " + batteryLife + " часов.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип девайса: ноут");
        showBatteryLife();
    }
}
