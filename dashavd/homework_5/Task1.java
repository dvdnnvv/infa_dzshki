import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String filename = "test.txt"; // Укажите путь к файлу
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Переменная для хранения строки, прочитанной из файла
            String line;
            // Переменная для подсчета количества слов
            int wordCount = 0;
            
            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                // Разделение строки на слова по пробелам и подсчет их количества
                wordCount += line.split("\\s+").length;
            }
            
            // Вывод количества слов в файле
            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода
            e.printStackTrace();
        }
    }
}
