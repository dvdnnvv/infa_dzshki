package homework_4.Tasks_10.Task4;

class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    public void eat(String foodType) {
        System.out.println("Lion eats " + foodType);
    }

    public void hunt() {
        System.out.println("Lion is hunting!");
    }
}