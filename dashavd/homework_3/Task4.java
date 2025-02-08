import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        // Нахождение количества одинаковых символов в начале строки
        int count = 0;
        char firstChar = input.charAt(0);
        while (count < input.length() && input.charAt(count) == firstChar) {
            count++;
        }

        System.out.println("Количество одинаковых символов в начале строки: " + count);
    }
}
