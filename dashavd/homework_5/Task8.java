import java.io.*;
import java.util.regex.*;

public class Task8 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу
        String digitsOnlyRegex = "\\d+"; // Регулярное выражение для цифр

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches(digitsOnlyRegex)) {
                    System.out.println("Строка состоит только из цифр: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
