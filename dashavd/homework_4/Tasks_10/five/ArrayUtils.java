package five;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {

    // Метод для вычисления суммы элементов массива
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Метод для вычисления среднего арифметического
    public static double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return (double) getSum(array) / array.length;
    }

    // Метод для нахождения максимального значения
    public static int max_value(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения минимального значения
    public static int min_value(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для нахождения моды (самое часто встречающееся значение)
    public static int mode(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mode;
    }

    // Метод для сортировки массива по возрастанию
    public static int[] sort_ascending(int[] array) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray); // Сортируем массив
        return sortedArray;
    }

}
