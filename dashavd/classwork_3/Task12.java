import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] matrix = new double[n][m];

        // Ввод матрицы
        double maxAbs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();
                maxAbs = Math.max(maxAbs, Math.abs(matrix[i][j]));
            }
        }

        // Деление на максимальный по модулю элемент
        if (maxAbs != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] /= maxAbs;
                    System.out.printf("%.2f ", matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Все элементы равны нулю.");
        }
    }
}
