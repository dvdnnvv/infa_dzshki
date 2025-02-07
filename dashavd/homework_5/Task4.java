import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        String filename = "your_file.txt"; // Укажите путь к файлу

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            boolean isEmpty = true;

            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    isEmpty = false;
                    try {
                        Integer.parseInt(line);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: строка " + lineNumber + " не может быть преобразована в число.");
                    }
                }
                lineNumber++;
            }

            if (isEmpty) {
                throw new EmptyFileException("Файл пуст.");
            }

        } catch (IOException e) {
            System.out.println("Ошибка: файл не найден.");
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
    }
}
