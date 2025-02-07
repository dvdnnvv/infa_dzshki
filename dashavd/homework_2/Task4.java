import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double[][] matrix = new double[m][n];

        // Ввод матрицы
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Нахождение суммы наибольших значений элементов каждой строки
        double sum = 0;
        for (int i = 0; i < m; i++) {
            double max = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            sum += max;
        }

        System.out.println("Сумма наибольших элементов каждой строки: " + sum);
    }
}
