import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        
        String binary = Integer.toBinaryString(num);
        
        System.out.println("Двоичное представление: " + binary);
        scanner.close();
    }
}