package homework_4.Tasks_10.Task4;

class Monkey implements Animal {
    public void makeSound() {
        System.out.println("Monkey screeches!");
    }

    public void eat(String foodType) {
        System.out.println("Monkey eats " + foodType);
    }

    public void swing() {
        System.out.println("Monkey swings from the trees!");
    }
}
