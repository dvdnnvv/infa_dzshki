package tri;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание объектов дробей
            RationalFraction f1 = new RationalFraction(2, 3);
            RationalFraction f2 = new RationalFraction(4, 6);

            // Тестирование методов
            System.out.println("Дробь f1: " + f1); // 2/3
            System.out.println("Дробь f2: " + f2); // 2/3

            // Сложение дробей
            RationalFraction f3 = f1.add(f2);
            System.out.println("Сложение: " + f3); // 4/3

            // Сложение дробей с сохранением в f1
            f1.add2(f2);
            System.out.println("После сложения (add2): " + f1); // 4/3

            // Вычитание дробей
            RationalFraction f4 = f1.sub(f2);
            System.out.println("Вычитание: " + f4); // 0/3

            // Умножение дробей
            RationalFraction f5 = f1.mult(f2);
            System.out.println("Умножение: " + f5); // 8/9

            // Деление дробей
            RationalFraction f6 = f1.div(f2);
            System.out.println("Деление: " + f6); // 1/1

            // Проверка равенства дробей
            System.out.println("Равенство f1 и f2: " + f1.equals(f2)); // true

            // Получение целой части
            System.out.println("Целая часть f1: " + f1.numberPart()); // 1

            // Получение десятичного значения
            System.out.println("Десятичное значение f1: " + f1.value()); // 1.333...

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
