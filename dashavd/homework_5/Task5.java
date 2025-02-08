import java.io.*;
import java.util.regex.*;

public class Task5 {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filename = "test.txt"; 

        // Регулярное выражение для поиска номеров телефонов в формате +7-XXX-XXX-XX-XX
        String phoneNumberRegex = "\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        
        // Создание Pattern объекта с регулярным выражением
        Pattern pattern = Pattern.compile(phoneNumberRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Чтение файла построчно
            String line;
            while ((line = reader.readLine()) != null) {
                // Создание объекта Matcher для проверки строки на совпадение с регулярным выражением
                Matcher matcher = pattern.matcher(line);

                // Если совпадения найдены, выводим их
                while (matcher.find()) {
                    System.out.println("Найден номер телефона: " + matcher.group());
                }
            }
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода (например, если файл не найден)
            e.printStackTrace();
        }
    }
}
