import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 15;
        int[][] matrix = new int[size][size];

        // Ввод матрицы
        boolean hasNonZero = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] != 0) hasNonZero = true;
            }
        }

        if (!hasNonZero) {
            System.out.println("Вся матрица содержит только нули.");
            return;
        }

        // a) Найти первый ненулевой элемент
        boolean foundFirst = false;
        for (int i = 0; i < size && !foundFirst; i++) {
            for (int j = 0; j < size && !foundFirst; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Первый ненулевой элемент: " + matrix[i][j] + " на позиции (" + i + "," + j + ")");
                    foundFirst = true;
                }
            }
        }

        // b) Найти все ненулевые элементы
        System.out.println("Все ненулевые элементы:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Элемент " + matrix[i][j] + " на позиции (" + i + "," + j + ")");
                }
            }
        }
    }
}
