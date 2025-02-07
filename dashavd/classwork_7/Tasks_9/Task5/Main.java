package Tasks_9.Task5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("рэкс", 5, "лабрадор"), new Cat("ахмед", 3, "черный")};

        for (Animal animal : animals) {
            System.out.println(animal.name + " говорит: " + animal.speak());
        }
    }
}