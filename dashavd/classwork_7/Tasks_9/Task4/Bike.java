package Tasks_9.Task4;


class Bike implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Велосипед начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился.");
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Велосипед разогнался до " + speed + " км/ч.");
    }
}