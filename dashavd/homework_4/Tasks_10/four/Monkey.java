package four;

public class Monkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Ууу-ууу! Обезьяна кричит!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Обезьяна ест: " + foodType);
    }

    // Дополнительный метод для обезьяны
    public void swing() {
        System.out.println("Обезьяна качается на ветвях!");
    }
}
