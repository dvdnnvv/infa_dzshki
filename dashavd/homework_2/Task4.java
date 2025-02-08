import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров матрицы
        System.out.println("Введите количество строк m и столбцов n матрицы:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Создание матрицы
        double[][] matrix = new double[m][n];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Нахождение суммы наибольших элементов каждой строки
        double sum = 0;
        for (int i = 0; i < m; i++) {
            double max = matrix[i][0]; // Предполагаем, что первый элемент строки - максимальный
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j]; // Обновляем максимальный элемент строки
                }
            }
            sum += max; // Добавляем максимальное значение строки в сумму
        }

        // Вывод результата
        System.out.println("Сумма наибольших элементов каждой строки: " + sum);

        scanner.close(); // Закрываем Scanner
    }
}
