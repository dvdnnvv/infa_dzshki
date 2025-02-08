package dva;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание объектов векторов
            Vector2D v1 = new Vector2D(3, 4);
            Vector2D v2 = new Vector2D(1, 2);

            // Тестирование метода add
            Vector2D v3 = v1.add(v2);
            System.out.println("Сложение: " + v3);

            // Тестирование метода add2
            v1.add2(v2);
            System.out.println("После add2: " + v1);

            // Тестирование метода sub
            Vector2D v4 = v1.sub(v2);
            System.out.println("Вычитание: " + v4);

            // Тестирование метода sub2
            v1.sub2(v2);
            System.out.println("После sub2: " + v1);

            // Тестирование метода mult
            Vector2D v5 = v1.mult(2);
            System.out.println("Умножение на скаляр: " + v5);

            // Тестирование метода mult2
            v1.mult2(0.5);
            System.out.println("После умножения на скаляр (mult2): " + v1);

            // Тестирование метода length
            System.out.println("Длина вектора: " + v1.length());

            // Тестирование метода scalarProduct
            System.out.println("Скалярное произведение: " + v1.scalarProduct(v2));

            // Тестирование метода cos
            System.out.println("Косинус угла: " + v1.cos(v2));

            // Тестирование метода equals
            System.out.println("Равенство векторов: " + v1.equals(v2));

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
