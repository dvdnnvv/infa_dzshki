package raz;

abstract class Device {
    private String brand;
    private String model;

    // Конструктор 1
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Конструктор 2
    public Device() {
        this.brand = "Неизвестно";
        this.model = "Неизвестно";
    }

    // Абстрактный метод
    public abstract void turnOn();

    // Не абстрактный метод
    public void showDetails() {
        System.out.println("Бренд: " + brand + ", Модель: " + model);
    }

    // Не абстрактный метод
    public void turnOff() {
        System.out.println("Девайс выключен.");
    }
}
