package four;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров животных
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        // Создание объекта зоопарка
        Zoo zoo = new Zoo();

        // Добавление животных в зоопарк
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        // Звуки всех животных
        System.out.println("Все животные издают свои звуки:");
        zoo.makeAllSounds();

        // Кормление всех животных
        System.out.println("\nВсе животные кормятся:");
        zoo.feedAll("мясо");

        // Использование специфичных методов для каждого животного
        System.out.println("\nДействия животных:");
        ((Lion) lion).hunt();
        ((Elephant) elephant).playWater();
        ((Monkey) monkey).swing();
    }
}
