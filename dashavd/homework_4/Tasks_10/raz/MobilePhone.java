package raz;

class MobilePhone extends Device {
    private MobileOS mobileOS;

    // Конструктор 1 (использует родительский)
    public MobilePhone(String brand, String model, MobileOS mobileOS) {
        super(brand, model);
        this.mobileOS = mobileOS;
    }

    // Конструктор 2 (использует конструктор родителя по умолчанию)
    public MobilePhone(MobileOS mobileOS) {
        super();
        this.mobileOS = mobileOS;
    }

    // Реализация абстрактного метода
    @Override
    public void turnOn() {
        System.out.println("Телефон включается...");
    }

    // Переопределение неабстрактного метода
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("ОС: " + mobileOS);
    }

    // Дополнительный метод
    public void makeCall(String contact) {
        System.out.println("Звонок " + contact + " работает " + mobileOS);
    }
}
