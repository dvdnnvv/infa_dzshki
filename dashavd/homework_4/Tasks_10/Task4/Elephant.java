package homework_4.Tasks_10.Task4;

class Elephant implements Animal {
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }

    public void eat(String foodType) {
        System.out.println("Elephant eats " + foodType);
    }

    public void playWater() {
        System.out.println("Elephant plays with water!");
    }
}