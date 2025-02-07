import java.io.*;
import java.util.regex.*;

public class Task6 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу
        String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})\\b";
        Pattern pattern = Pattern.compile(dateRegex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Найдена дата: " + matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
