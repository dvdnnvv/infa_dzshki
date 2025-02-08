import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод слова
        System.out.println("Введите слово из 12 букв:");
        String word = scanner.nextLine();

        // Проверка на длину слова
        if (word.length() != 12) {
            System.out.println("Слово должно состоять из 12 букв.");
            return;
        }

        // Разделение на три части
        String part1 = word.substring(0, 4);
        String part2 = word.substring(4, 8);
        String part3 = word.substring(8);

        // а) Перестановка первой, второй и третьей частей
        String rearranged1 = part3 + part1 + part2;
        System.out.println("Перестановка частей: " + rearranged1);

        // б) Перестановка первой, второй и третьей частей в другом порядке
        String rearranged2 = part2 + part3 + part1;
        System.out.println("Перестановка частей (в другом порядке): " + rearranged2);
    }
}
