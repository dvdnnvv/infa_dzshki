import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите стороны треугольника x, y, z: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Треугольник существует.");
            if (x*x + y*y > z*z && x*x + z*z > y*y && y*y + z*z > x*x) {
                System.out.println("Треугольник остроугольный.");
            } else {
                System.out.println("Треугольник не остроугольный.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }

        scanner.close();
    }
}