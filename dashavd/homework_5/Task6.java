import java.io.*;
import java.util.regex.*;

public class Task6 {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filename = "test.txt"; 

        // Регулярное выражение для поиска даты в формате DD.MM.YYYY
        String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})\\b";
        
        // Создание Pattern объекта с регулярным выражением для поиска дат
        Pattern pattern = Pattern.compile(dateRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Чтение файла построчно
            String line;
            while ((line = reader.readLine()) != null) {
                // Создание объекта Matcher для каждой строки, чтобы найти все совпадения с регулярным выражением
                Matcher matcher = pattern.matcher(line);

                // Если совпадения найдены, выводим их
                while (matcher.find()) {
                    System.out.println("Найдена дата: " + matcher.group());
                }
            }
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода (например, если файл не найден)
            e.printStackTrace();
        }
    }
}
