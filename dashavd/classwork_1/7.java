import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число k: ");
        int k = scanner.nextInt();
        
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " × " + k + " = " + (i * k));
        }
        
        scanner.close();
    }
}