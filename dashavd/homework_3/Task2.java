import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.println("Введите размерность матрицы n:");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Суммы для элементов в строках, начинающихся с отрицательного элемента
        double sumBelow = 0, sumAbove = 0, sumOnDiagonal = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] < 0) {
                for (int j = 0; j < n; j++) {
                    if (j < i) {
                        sumAbove += matrix[i][j];
                    }
                    if (j > i) {
                        sumBelow += matrix[i][j];
                    }
                    if (i == j) {
                        sumOnDiagonal += matrix[i][j];
                    }
                }
            }
        }

        System.out.println("Сумма элементов ниже главной диагонали: " + sumBelow);
        System.out.println("Сумма элементов выше главной диагонали: " + sumAbove);
        System.out.println("Сумма элементов на главной диагонали: " + sumOnDiagonal);
    }
}
