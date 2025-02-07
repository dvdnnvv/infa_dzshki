import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
