import java.util.Scanner; // Подключаем сканер для ввода данных

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner для чтения ввода

        // Просим пользователя ввести число
        System.out.println("Введите натуральное число n (n <= 100):");
        int n = scanner.nextInt(); // Считываем число

        // Проверяем, что число в допустимых границах
        if (n <= 0 || n > 100) {
            System.out.println("Ошибка: n должно быть натуральным числом от 1 до 100.");
            return; // Завершаем программу, если число неправильное
        }

        // a) Количество цифр в числе
        int digitCount = String.valueOf(n).length(); // Преобразуем число в строку и считаем длину

        // b) Сумма всех цифр числа
        int sumOfDigits = 0;
        int temp = n; // Создаём копию числа, чтобы не менять оригинал
        while (temp > 0) { // Пока в числе есть цифры
            sumOfDigits += temp % 10; // Берём последнюю цифру и прибавляем к сумме
            temp /= 10; // Убираем последнюю цифру
        }

        // c) Определяем первую цифру
        String numberStr = String.valueOf(n); // Переводим число в строку
        int firstDigit = Character.getNumericValue(numberStr.charAt(0)); // Берём первый символ и преобразуем в число

        // d) Предпоследняя цифра (если число больше 9)
        int penultimateDigit;
        if (n >= 10) {
            penultimateDigit = (n / 10) % 10; // Убираем последнюю цифру и берём новую последнюю
            System.out.println("d) Предпоследняя цифра: " + penultimateDigit);
        } else {
            System.out.println("d) Число меньше 10, предпоследней цифры нет.");
        }

        // Выводим результаты
        System.out.println("a) Количество цифр: " + digitCount);
        System.out.println("b) Сумма цифр: " + sumOfDigits);
        System.out.println("c) Первая цифра: " + firstDigit);

        scanner.close(); // Закрываем Scanner
    }
}
