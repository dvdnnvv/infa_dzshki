import java.io.*;
import java.util.regex.*;

public class Task5 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу
        String phoneNumberRegex = "\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(phoneNumberRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Найден номер телефона: " + matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
