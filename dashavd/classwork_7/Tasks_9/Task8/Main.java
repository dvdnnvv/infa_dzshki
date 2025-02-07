package Tasks_9.Task8;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В.В.", "12345", "Физика", "01.01.2000", "123456789");
        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        reader.takeBook(book1, book2);
    }
}