package homework_4.Tasks_10.Task4;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        zoo.makeAllSounds();
        zoo.feedAll("fruits");
    }
}