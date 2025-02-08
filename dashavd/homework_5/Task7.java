import java.io.*;
import java.util.regex.*;

public class Task7 {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filename = "test.txt"; 
        
        // Регулярное выражение для поиска слов с заглавной буквы
        String capitalLetterRegex = "\\b[A-ZА-ЯЁ][a-zа-яё]*\\b"; 
        Pattern pattern = Pattern.compile(capitalLetterRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Чтение файла построчно
            String line;
            while ((line = reader.readLine()) != null) {
                // Создание объекта Matcher для каждой строки, чтобы найти все совпадения с регулярным выражением
                Matcher matcher = pattern.matcher(line);

                // Если совпадения найдены, выводим их
                while (matcher.find()) {
                    System.out.println("Найдено слово: " + matcher.group());
                }
            }
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода (например, если файл не найден)
            e.printStackTrace();
        }
    }
}
