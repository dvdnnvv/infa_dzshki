import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.println("Введите размерность матрицы n:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // A) Все элементы которых - нули
        System.out.println("Строки, все элементы которых - нули:");
        for (int i = 0; i < n; i++) {
            boolean allZero = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                System.out.println(i + 1);
            }
        }

        // B) Элементы в каждой из которых одинаковы
        System.out.println("Строки, все элементы которых одинаковы:");
        for (int i = 0; i < n; i++) {
            boolean allSame = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println(i + 1);
            }
        }

        // C) Все элементы которых нечетны
        System.out.println("Строки, все элементы которых нечетны:");
        for (int i = 0; i < n; i++) {
            boolean allOdd = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                System.out.println(i + 1);
            }
        }

        // D) Элементы каждой из которых образуют монотонную последовательность
        System.out.println("Строки, элементы которых образуют монотонную последовательность:");
        for (int i = 0; i < n; i++) {
            boolean isMonotonic = true;
            boolean isIncreasing = true, isDecreasing = true;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][j - 1]) {
                    isIncreasing = false;
                }
                if (matrix[i][j] > matrix[i][j - 1]) {
                    isDecreasing = false;
                }
            }

            if (isIncreasing || isDecreasing) {
                System.out.println(i + 1);
            }
        }

        // E) Элементы которых образуют симметричные последовательность (палиндромы)
        System.out.println("Строки, элементы которых образуют палиндромы:");
        for (int i = 0; i < n; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < n / 2; j++) {
                if (matrix[i][j] != matrix[i][n - j - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(i + 1);
            }
        }
    }
}
