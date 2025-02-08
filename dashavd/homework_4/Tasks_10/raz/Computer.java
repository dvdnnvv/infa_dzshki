package raz;

class Computer extends Device {
    private OS operatingSystem;

    // Конструктор 1 (использует родительский)
    public Computer(String brand, String model, OS operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    // Конструктор 2 (использует конструктор родителя по умолчанию)
    public Computer(OS operatingSystem) {
        super();
        this.operatingSystem = operatingSystem;
    }

    // Реализация абстрактного метода
    @Override
    public void turnOn() {
        System.out.println("Компьютер перезагружается...");
    }

    // Переопределение неабстрактного метода
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("ОС: " + operatingSystem);
    }

    // Дополнительный метод
    public void runApp(String appName) {
        System.out.println("Включен " + appName + " да " + operatingSystem);
    }
}