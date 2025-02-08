import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя числа n
        System.out.print("Введите число лет: ");
        int n = scanner.nextInt();

        // Определяем правильное окончание слова "год"
        if (n % 10 == 1 && n % 100 != 11) {
            System.out.println(n + " год"); // Например: 1 год, 21 год, 101 год
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            System.out.println(n + " года"); // Например: 2 года, 24 года, 52 года
        } else {
            System.out.println(n + " лет"); // Например: 5 лет, 11 лет, 100 лет
        }

        scanner.close();
    }
}
