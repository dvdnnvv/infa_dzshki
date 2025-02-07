package homework_4.Tasks_10.Task7;

import java.util.*;

public class Task1 {
    
    // Метод для нахождения суммы элементов массива
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Метод для нахождения среднего арифметического элементов массива
    public static double average(int[] array) {
        int sum = getSum(array);
        return (double) sum / array.length;
    }

    // Метод для нахождения максимального значения в массиве
    public static int max_value(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения минимального значения в массиве
    public static int min_value(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для нахождения моды (наиболее часто встречающегося элемента)
    public static int mode(int[] array) {
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
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        System.out.println("Сумма: " + getSum(array));
        System.out.println("Среднее арифметическое: " + average(array));
        System.out.println("Максимальное значение: " + max_value(array));
        System.out.println("Минимальное значение: " + min_value(array));
        System.out.println("Мода: " + mode(array));

        int[] sortedArray = sort_ascending(array);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
