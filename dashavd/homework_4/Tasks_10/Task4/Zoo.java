package homework_4.Tasks_10.Task4;

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void feedAll(String foodType) {
        for (Animal animal : animals) {
            animal.eat(foodType);
        }
    }
}