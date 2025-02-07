import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину последовательности:");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Последовательность должна быть длиной не менее 3.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenLocalMaxCount = 0;

        for (int i = 1; i < n - 1; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1] && numbers[i] % 2 == 0) {
                evenLocalMaxCount++;
            }
        }

        if (evenLocalMaxCount == 2) {
            System.out.println("Ровно два чётных локальных максимума существуют.");
        } else {
            System.out.println("Чётных локальных максимумов не ровно два.");
        }
    }
}
