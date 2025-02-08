import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Создаем сканер для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);
        try {
            // Запрашиваем первое число
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine()); // Читаем и преобразуем ввод в число

            // Запрашиваем второе число
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine()); // Читаем и преобразуем второе число

            // Пытаемся выполнить деление и выводим результат
            System.out.println("Результат деления: " + (num1 / num2));
        } catch (NumberFormatException e) {
            // Обработка ошибки при неправильном формате ввода (например, текст вместо числа)
            System.out.println("Ошибка: некорректный ввод числа.");
        } catch (ArithmeticException e) {
            // Обработка ошибки деления на ноль
            System.out.println("Ошибка: деление на ноль.");
        } finally {
            // Закрываем сканер после использования
            scanner.close();
        }
    }
}
