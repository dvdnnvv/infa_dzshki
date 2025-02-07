package homework_4.Tasks_10.Task1;

class MobilePhone extends Device {
    String carrier;

    public MobilePhone(String name, double price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }

    public MobilePhone(String name, String carrier) {
        super(name);
        this.carrier = carrier;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " мобила включена!");
    }

    public void showCarrier() {
        System.out.println("жиес: " + carrier);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("тип девайся: мобила");
        showCarrier();
    }
}