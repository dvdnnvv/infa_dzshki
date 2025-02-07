import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа x, y, z: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x + y + z < 1) {
            double min = Math.min(x, Math.min(y, z));
            if (min == x) x = (y + z) / 2;
            else if (min == y) y = (x + z) / 2;
            else z = (x + y) / 2;
        } else {
            if (x < y) x = (y + z) / 2;
            else y = (x + z) / 2;
        }

        System.out.println("Результат: " + x + ", " + y + ", " + z);
        scanner.close();
    }
}