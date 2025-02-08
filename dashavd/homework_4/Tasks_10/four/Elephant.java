package four;

public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Трубит! Слон трубит!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Слон ест: " + foodType);
    }

    // Дополнительный метод для слона
    public void playWater() {
        System.out.println("Слон играет с водой!");
    }
}
