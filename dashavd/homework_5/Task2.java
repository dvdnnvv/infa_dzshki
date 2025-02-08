import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // Указываем путь к входному и выходному файлам, а также старое и новое слово для замены
        String inputFilename = "test.txt"; // Путь к входному файлу
        String outputFilename = "output_file.txt"; // Путь к выходному файлу
        String oldWord = "oldWord"; // Старое слово, которое нужно заменить
        String newWord = "newWord"; // Новое слово, на которое нужно заменить

        try {
            // Читаем все строки из входного файла в список
            List<String> lines = Files.readAllLines(Paths.get(inputFilename));
            
            // Проходим по каждой строке и заменяем старое слово на новое
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replaceAll(oldWord, newWord)); // Заменяем слова в каждой строке
            }
            
            // Записываем измененные строки в выходной файл
            Files.write(Paths.get(outputFilename), lines);
            
            // Выводим сообщение о завершении работы
            System.out.println("Слова в файле заменены.");
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода, например, если файл не найден
            e.printStackTrace();
        }
    }
}
