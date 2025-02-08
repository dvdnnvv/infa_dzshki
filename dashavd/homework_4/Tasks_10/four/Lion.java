package four;

public class Lion implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Ррррр! Лев рычит!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Лев ест: " + foodType);
    }

    // Дополнительный метод для льва
    public void hunt() {
        System.out.println("Лев идет на охоту!");
    }
}
