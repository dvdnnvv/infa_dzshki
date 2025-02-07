import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class AllTasks {

    // 1. Программа, которая читает все строки файла и выводит их в консоль
    public static void readFileAndPrint(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. Программа, которая считает количество строк в текстовом файле и выводит результат в консоль
    public static void countLinesInFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. Программа, которая читает файл построчно и выводит его содержимое в консоль, добавляя номер перед каждой строкой
    public static void readFileWithLineNumbers(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. Программа, которая проверяет, встречается ли слово в тексте, и выводит количество его вхождений
    public static void countWordOccurrences(String filename, String word) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                count += line.split("\\s+").length;
            }
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5. Программа, которая считывает содержимое из одного файла и записывает его в другой
    public static void copyFile(String sourceFilename, String destFilename) {
        try {
            Files.copy(Paths.get(sourceFilename), Paths.get(destFilename), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл скопирован успешно.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6. Программа, которая считает количество слов в файле
    public static void countWordsInFile(String filename) {
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

    // 7. Программа, которая находит и заменяет слово в файле
    public static void replaceWordInFile(String filename, String oldWord, String newWord, String outputFilename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replaceAll(oldWord, newWord));
            }
            Files.write(Paths.get(outputFilename), lines);
            System.out.println("Слова в файле заменены.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 8. Программа с обработкой исключений при делении на ноль
    public static void divideNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.println("Результат деления: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        }
    }

    // 9. Программа с обработкой ошибки при отсутствии файла
    public static void readFileWithErrorHandling() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите путь к файлу: ");
                String filename = scanner.nextLine();
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден, попробуйте указать другой путь.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 10. Программа для деления двух чисел с обработкой исключений
    public static void divideTwoNumbersWithExceptionHandling() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат деления: " + (num1 / num2));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        }
    }

    // 11. Преобразование строк в числа с обработкой NumberFormatException
    public static void convertStringsToNumbers(String[] array) {
        for (String str : array) {
            try {
                int number = Integer.parseInt(str);
                System.out.println("Число: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования: " + str);
            }
        }
    }

    // 12. Собственное исключение NegativeNumberException
    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void checkForNegativeNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Ошибка: введено отрицательное число.");
        }
    }

    // 13. Обработка исключений при чтении файла
    public static void readFileWithExceptionsHandling(String filename) throws EmptyFileException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                try {
                    Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: строка " + lineNumber + " не является числом.");
                }
                lineNumber++;
            }
            if (lineNumber == 1) {
                throw new EmptyFileException("Ошибка: файл пуст.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
        }
    }

    public static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    // 14. Регулярное выражение для проверки почтового адреса
    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    // 15. Регулярное выражение для проверки номера телефона
    public static boolean isValidPhoneNumber(String phone) {
        String regex = "^\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}$";
        return phone.matches(regex);
    }

    // 16. Регулярное выражение для извлечения дат
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    // 17. Регулярное выражение для поиска слов с заглавной буквы
    public static List<String> findWordsWithCapitalLetters(String text) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    // 18. Регулярное выражение для проверки строки на цифры
    public static boolean isAllDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        // Пример вызова методов
        readFileAndPrint("file.txt");
        countLinesInFile("file.txt");
        readFileWithLineNumbers("file.txt");
        countWordOccurrences("file.txt", "word");
        copyFile("source.txt", "destination.txt");
        countWordsInFile("file.txt");
        replaceWordInFile("file.txt", "oldWord", "newWord", "output.txt");
        divideNumbers();
        readFileWithErrorHandling();
        divideTwoNumbersWithExceptionHandling();
    }
}
