import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух слов
        System.out.println("Введите первое слово:");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();

        // Для каждой буквы первого слова проверяем, входит ли она во второе слово
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (word2.indexOf(c) != -1) {
                System.out.print("да ");
            } else {
                System.out.print("нет ");
            }
        }
    }
}
