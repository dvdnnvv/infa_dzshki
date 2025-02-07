import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите последовательность чисел (ввод остановится при уменьшении значения):");
        
        int prev = scanner.nextInt();
        while (true) {
            int curr = scanner.nextInt();
            if (curr < prev) {
                break;
            }
            prev = curr;
        }

        System.out.println("Ввод завершен.");
        scanner.close();
    }
}