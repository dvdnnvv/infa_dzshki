import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действительное число a:");
        double a = scanner.nextDouble();

        double f;
        if (a <= 0) {
            f = 0;
        } else if (a > 0 && a <= 1) {
            f = Math.pow(a, 2) - a;
        } else {
            f = Math.pow(a, 2) - Math.sin(Math.PI * Math.pow(a, 2));
        }

        System.out.println("Значение функции f(a): " + f);
    }
}
