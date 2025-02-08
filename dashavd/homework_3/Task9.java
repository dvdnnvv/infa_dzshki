import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод предложения
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();

        // Убираем начальные и конечные пробелы
        sentence = sentence.trim();

        // Разделение предложения на слова
        String[] words = sentence.split("\\s+");

        // Количество слов
        int wordCount = words.length;

        System.out.println("Количество слов в предложении: " + wordCount);
    }
}
