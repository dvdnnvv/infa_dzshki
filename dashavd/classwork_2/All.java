import java.util.Scanner;

public class All {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1: Оценка по числу
        System.out.print("Введите число от 1 до 5: ");
        int k = scanner.nextInt();
        switch (k) {
            case 1 -> System.out.println("плохо");
            case 2 -> System.out.println("неудовлетворительно");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");
            default -> System.out.println("ошибка");
        }
        
        // Task 2: Приветствие по времени
        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        if (hours >= 5 && hours < 12) {
            System.out.println("Доброе утро");
        } else if (hours >= 12 && hours < 18) {
            System.out.println("Добрый день");
        } else if (hours >= 18 && hours < 22) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Доброй ночи");
        }
        
        // Task 3: Меню операций с числом
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        System.out.println("Выберите действие: 1-квадрат, 2-корень, 3-синус, 4-косинус");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Квадрат: " + (x * x));
            case 2 -> System.out.println("Корень: " + Math.sqrt(x));
            case 3 -> System.out.println("Синус: " + Math.sin(x));
            case 4 -> System.out.println("Косинус: " + Math.cos(x));
            default -> System.out.println("Ошибка ввода");
        }
        
        // Task 4: Заглавная буква
        System.out.print("Введите букву (a-f): ");
        char letter = scanner.next().charAt(0);
        System.out.println("Заглавная: " + Character.toUpperCase(letter));
        
        // Task 5: Сколько месяцев до конца года
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Осталось месяцев: " + (12 - month));
        
        // Task 6: Прямоугольник из единиц
        System.out.print("Введите размеры m и n: ");
        int m = scanner.nextInt(), n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
        
        // Task 7: Преобразование числа
        System.out.print("Введите a, b и z: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        double z = scanner.nextDouble();
        System.out.println(a % b == 0 ? z * a : z / a);
        
        // Task 8: Локальный максимум
        System.out.print("Введите длину последовательности: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        System.out.println("Введите элементы: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean hasEvenMax = false;
        for (int i = 1; i < len - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i] % 2 == 0) {
                hasEvenMax = true;
                break;
            }
        }
        System.out.println(hasEvenMax ? "Есть четный локальный максимум" : "Нет четного локального максимума");
        
        // Task 9: Числа, делящиеся на 5, но не на 7
        System.out.print("Введите количество чисел: ");
        int numCount = scanner.nextInt();
        int sum = 0, count = 0;
        System.out.println("Введите числа: ");
        for (int i = 0; i < numCount; i++) {
            int num = scanner.nextInt();
            if (num % 5 == 0 && num % 7 != 0) {
                sum += num;
                count++;
            }
        }
        System.out.println("Количество: " + count + ", Сумма: " + sum);
        

        // Task 10: Удвоенная сумма положительных элементов
        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();
        double[] sequence = new double[n];
        double positiveSum = 0;
        System.out.println("Введите элементы последовательности: ");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextDouble();
            if (sequence[i] > 0) {
                positiveSum += sequence[i];
            }
        }
        System.out.println("Удвоенная сумма положительных элементов: " + (2 * positiveSum));

        // Task 11: Произведение элементов, кратных 7
        System.out.print("Введите количество элементов последовательности: ");
        n = scanner.nextInt();
        int p = 7; // Число, кратным которому нужно найти произведение
        int product = 1;
        boolean found = false;
        System.out.println("Введите элементы последовательности: ");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element % p == 0) {
                product *= element;
                found = true;
            }
        }
        System.out.println(found ? "Произведение элементов, кратных 7: " + product : "Нет элементов, кратных 7");

        // Task 12: Вычисление функций f(x)
        System.out.print("Введите действительное число a: ");
        double aValue = scanner.nextDouble();
        // a) Первая функция
        double f1 = (aValue >= -2 && aValue < 2) ? Math.pow(aValue, 2) : 4;
        System.out.println("Результат f(a) для первой функции: " + f1);
        // b) Вторая функция
        double f2 = (aValue <= 2) ? (Math.pow(aValue, 2) + 4 * aValue + 5) : (1 / (Math.pow(aValue, 2) + 4 * aValue + 5));
        System.out.println("Результат f(a) для второй функции: " + f2);

        // Task 13: Математические вычисления
        System.out.print("Введите действительное число a и натуральное число n: ");
        double base = scanner.nextDouble();
        int exponent = scanner.nextInt();

        // a) a^n
        double power = Math.pow(base, exponent);
        System.out.println("a^n: " + power);

        // b) a(a+1)...(a+n-1)
        double productSeries = 1;
        for (int i = 0; i < exponent; i++) {
            productSeries *= (base + i);
        }
        System.out.println("Произведение последовательности: " + productSeries);

        // c) 1/a + 1/(a+1) + ... + 1/(a+n)
        double sumSeries = 0;
        for (int i = 0; i <= exponent; i++) {
            sumSeries += 1 / (base + i);
        }
        System.out.println("Сумма последовательности: " + sumSeries);

        // Task 14: Среднее арифметическое без a[i]
        System.out.print("Введите длину последовательности (n): ");
        int totalLength = scanner.nextInt();
        double[] numbers = new double[totalLength];
        System.out.println("Введите элементы последовательности: ");
        double totalSum = 0;
        for (int i = 0; i < totalLength; i++) {
            numbers[i] = scanner.nextDouble();
            totalSum += numbers[i];
        }
        System.out.print("Введите индекс элемента i (1 <= i <= n): ");
        int excludedIndex = scanner.nextInt() - 1; // Преобразуем в 0-индексацию
        if (excludedIndex >= 0 && excludedIndex < totalLength) {
            double average = (totalSum - numbers[excludedIndex]) / (totalLength - 1);
            System.out.println("Среднее арифметическое без a[" + (excludedIndex + 1) + "]: " + average);
        } else {
            System.out.println("Неверный индекс");
        }

        scanner.close();
    }
}
