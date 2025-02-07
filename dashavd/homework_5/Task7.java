import java.io.*;
import java.util.regex.*;

public class Task7 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу
        String capitalLetterRegex = "\\b[A-ZА-ЯЁ][a-zа-яё]*\\b"; // Поиск слов с заглавной буквы
        Pattern pattern = Pattern.compile(capitalLetterRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Найдено слово: " + matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
