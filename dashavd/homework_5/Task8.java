import java.io.*;
import java.util.regex.*;

public class Task8 {
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filename = "test.txt"; 
        
        // Регулярное выражение для поиска строк, состоящих только из цифр
        String digitsOnlyRegex = "\\d+"; 
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Чтение файла построчно
            String line;
            while ((line = reader.readLine()) != null) {
                // Проверяем, состоит ли строка только из цифр с помощью matches
                if (line.matches(digitsOnlyRegex)) {
                    System.out.println("Строка состоит только из цифр: " + line);
                }
            }
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода (например, если файл не найден)
            e.printStackTrace();
        }
    }
}
