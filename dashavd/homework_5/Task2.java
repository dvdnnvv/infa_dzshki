import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String inputFilename = "your_file.txt"; // Укажите путь к входному файлу
        String outputFilename = "output_file.txt"; // Укажите путь к выходному файлу
        String oldWord = "oldWord"; // Замените на старое слово
        String newWord = "newWord"; // Замените на новое слово

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFilename));
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replaceAll(oldWord, newWord));
            }
            Files.write(Paths.get(outputFilename), lines);
            System.out.println("Слова в файле заменены.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
