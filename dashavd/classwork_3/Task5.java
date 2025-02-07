import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int index = 1, num;
        boolean found = false;

        while ((num = scanner.nextInt()) != 0) {
            if (!found && num > K) {
                System.out.println("Первый элемент больше K: " + index);
                found = true;
            }
            index++;
        }

        if (!found) {
            System.out.println(0);
        }
    }
}
