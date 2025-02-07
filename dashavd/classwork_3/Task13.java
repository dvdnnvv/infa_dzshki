import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] matrix = new double[n][m];

        // Ввод матрицы
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();
                if (matrix[i][j] > max) max = matrix[i][j];
                if (matrix[i][j] < min) min = matrix[i][j];
            }
        }

        System.out.println("Среднее арифметическое max и min: " + ((max + min) / 2));
    }
}
