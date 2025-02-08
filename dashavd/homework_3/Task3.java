import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод предложения
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine().trim();

        // Извлечение первого слова
        String firstWord = sentence.split(" ")[0];

        // Подсчет количества букв 'о' в первом слове
        int count = 0;
        for (char c : firstWord.toCharArray()) {
            if (c == 'о' || c == 'О') {
                count++;
            }
        }

        System.out.println("Количество букв 'о' в первом слове: " + count);
    }
}
