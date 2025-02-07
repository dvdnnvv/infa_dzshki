import java.util.*;

public class AllTasks {

    // 1. Квадратная матрица, порядок n
    // А) Номера строк, все элементы которых — нули
    public static List<Integer> findZeroRows(int[][] matrix) {
        List<Integer> zeroRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean allZero = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                zeroRows.add(i);
            }
        }
        return zeroRows;
    }

    // Б) Номера строк, все элементы которых одинаковы
    public static List<Integer> findIdenticalRows(int[][] matrix) {
        List<Integer> identicalRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean allSame = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                identicalRows.add(i);
            }
        }
        return identicalRows;
    }

    // В) Номера строк, все элементы которых нечетные
    public static List<Integer> findOddRows(int[][] matrix) {
        List<Integer> oddRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean allOdd = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                oddRows.add(i);
            }
        }
        return oddRows;
    }

    // Г) Номера строк, элементы которых образуют монотонную последовательность
    public static List<Integer> findMonotonicRows(int[][] matrix) {
        List<Integer> monotonicRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean increasing = true, decreasing = true;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    increasing = false;
                }
                if (matrix[i][j] < matrix[i][j + 1]) {
                    decreasing = false;
                }
            }
            if (increasing || decreasing) {
                monotonicRows.add(i);
            }
        }
        return monotonicRows;
    }

    // Д) Номера строк, элементы которых образуют симметричные последовательности (палиндромы)
    public static List<Integer> findPalindromeRows(int[][] matrix) {
        List<Integer> palindromeRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < matrix[i].length / 2; j++) {
                if (matrix[i][j] != matrix[i][matrix[i].length - 1 - j]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                palindromeRows.add(i);
            }
        }
        return palindromeRows;
    }

    // 2. Действительная квадратная матрица
    public static void sumElements(int[][] matrix) {
        int belowSum = 0, aboveSum = 0, onDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] < 0) { // строка начинается с отрицательного числа
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i > j) belowSum += matrix[i][j];
                    if (i < j) aboveSum += matrix[i][j];
                    if (i == j) onDiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Сумма ниже главной диагонали: " + belowSum);
        System.out.println("Сумма выше главной диагонали: " + aboveSum);
        System.out.println("Сумма на главной диагонали: " + onDiagonalSum);
    }

    // 3. Количество букв "о" в первом слове
    public static int countOInFirstWord(String sentence) {
        String firstWord = sentence.trim().split("\\s+")[0];
        int count = 0;
        for (char c : firstWord.toCharArray()) {
            if (c == 'о' || c == 'О') {
                count++;
            }
        }
        return count;
    }

    // 4. Количество одинаковых символов в начале последовательности
    public static int countInitialRepeatedChars(String sequence) {
        int count = 1;
        char firstChar = sequence.charAt(0);
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == firstChar) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // 5. Для каждого символа из первого слова, проверить, входит ли он во второе слово
    public static void checkLettersInSecondWord(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); i++) {
            if (word2.contains(String.valueOf(word1.charAt(i)))) {
                System.out.print("да ");
            } else {
                System.out.print("нет ");
            }
        }
    }

    // 6. Проверка, является ли слово "перевертышем"
    public static boolean isPalindrome(String word) {
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // 7. Номер максимальной цифры в тексте
    public static int findMaxDigitPosition(String text) {
        text = text.trim();
        int maxDigit = -1;
        int position = -1;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit > maxDigit) {
                    maxDigit = digit;
                    position = i + 1; // начиная с 1
                }
            }
        }
        return position;
    }

    // 8. Поменять местами части слова
    public static String swapThirds(String word, int part) {
        int len = word.length() / 3;
        String part1 = word.substring(0, len);
        String part2 = word.substring(len, 2 * len);
        String part3 = word.substring(2 * len);

        if (part == 1) {
            return part3 + part1 + part2;
        } else if (part == 2) {
            return part2 + part3 + part1;
        }
        return word;
    }

    // 9. Количество слов в предложении
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        // Пример вызова методов
        int[][] matrix = {
            {1, 2, 3},
            {0, 0, 0},
            {4, 4, 4}
        };
        System.out.println("Строки, все элементы которых нули: " + findZeroRows(matrix));
        System.out.println("Строки, все элементы которых одинаковы: " + findIdenticalRows(matrix));
        System.out.println("Строки, все элементы которых нечетные: " + findOddRows(matrix));
        System.out.println("Строки, элементы которых образуют монотонную последовательность: " + findMonotonicRows(matrix));
        System.out.println("Строки, элементы которых образуют палиндромы: " + findPalindromeRows(matrix));
    }
}
