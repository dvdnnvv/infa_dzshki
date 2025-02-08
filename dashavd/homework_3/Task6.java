import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод слова
        System.out.println("Введите слово:");
        String word = scanner.nextLine();

        // Проверка на палиндром
        boolean isPalindrome = true;
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Слово является перевертышем.");
        } else {
            System.out.println("Слово не является перевертышем.");
        }
    }
}
