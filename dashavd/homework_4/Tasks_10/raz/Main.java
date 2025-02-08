package raz;

public class Main {
    public static void main(String[] args) {
        // Создание объектов дочерних классов
        Device[] devices = new Device[4];
        devices[0] = new Computer("Dell", "XPS 13", OS.WINDOWS);
        devices[1] = new MobilePhone("Apple", "iPhone 12", MobileOS.IOS);
        devices[2] = new Computer(OS.LINUX);
        devices[3] = new MobilePhone(MobileOS.ANDROID);

        // Демонстрация работы полиморфизма
        for (Device device : devices) {
            device.showDetails();
            device.turnOn();
            if (device instanceof Computer) {
                ((Computer) device).runApp("Visual Studio");
            } else if (device instanceof MobilePhone) {
                ((MobilePhone) device).makeCall("Даша");
            }
            device.turnOff();
            System.out.println();
        }
    }
}
