import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество чисел n
        System.out.println("Введите количество чисел n:");
        int n = scanner.nextInt();

        // Инициализируем счетчик для подсчета чисел, удовлетворяющих условиям
        int count = 0;

        // Запрашиваем у пользователя ввод чисел
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); // Вводим число

            // Определяем длину числа (количество цифр)
            int length = String.valueOf(Math.abs(num)).length();

            // Инициализируем флаги для проверки, все ли цифры четные или нечетные
            boolean allEven = true; // Все цифры четные
            boolean allOdd = true;  // Все цифры нечетные

            // Работаем с абсолютным значением числа, чтобы игнорировать знак
            int temp = Math.abs(num);
            while (temp > 0) {
                int digit = temp % 10; // Получаем последнюю цифру числа

                // Проверяем, является ли цифра четной или нечетной
                if (digit % 2 == 0) {
                    allOdd = false; // Если цифра четная, allOdd становится false
                } else {
                    allEven = false; // Если цифра нечетная, allEven становится false
                }

                temp /= 10; // Убираем последнюю цифру из числа
            }

            // Проверяем, удовлетворяет ли число условиям:
            // 1. Длина числа равна 3 или 5.
            // 2. Все цифры числа либо четные, либо нечетные.
            if ((length == 3 || length == 5) && (allEven || allOdd)) {
                count++; // Увеличиваем счетчик, если число удовлетворяет условиям
            }
        }

        // Проверяем, сколько чисел соответствуют условиям
        if (count == 2) {
            System.out.println("Ровно два числа соответствуют условиям.");
        } else {
            System.out.println("Условию соответствуют " + count + " числа.");
        }
    }
}