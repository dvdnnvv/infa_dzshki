import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String filename = "test.txt"; // Укажите путь к файлу

        // Используем блок try для обработки исключений
        try {
            // Чтение файла с помощью BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            boolean isEmpty = true; // Флаг, чтобы определить, пуст ли файл

            int lineNumber = 1; // Счетчик строк
            while ((line = reader.readLine()) != null) {
                // Проверка на пустую строку (с учетом пробелов)
                if (!line.trim().isEmpty()) {
                    isEmpty = false; // Если строка не пустая, меняем флаг
                    try {
                        // Попытка преобразовать строку в число
                        Integer.parseInt(line);
                    } catch (NumberFormatException e) {
                        // Если строка не является числом, выводим сообщение
                        System.out.println("Ошибка: строка " + lineNumber + " не может быть преобразована в число.");
                    }
                }
                lineNumber++; // Переходим к следующей строке
            }

            // Если файл пустой (нет непустых строк), выбрасываем исключение
            if (isEmpty) {
                throw new EmptyFileException("Файл пуст.");
            }

        } catch (IOException e) {
            // Обработка ошибки ввода/вывода, если файл не найден
            System.out.println("Ошибка: файл не найден.");
        } catch (EmptyFileException e) {
            // Обработка ошибки, если файл пуст
            System.out.println(e.getMessage());
        }
    }
}