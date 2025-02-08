package five;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        System.out.println("Сумма элементов массива: " + ArrayUtils.getSum(array));
        System.out.println("Среднее арифметическое: " + ArrayUtils.average(array));
        System.out.println("Максимальное значение: " + ArrayUtils.max_value(array));
        System.out.println("Минимальное значение: " + ArrayUtils.min_value(array));
        System.out.println("Мода: " + ArrayUtils.mode(array));

        int[] sortedArray = ArrayUtils.sort_ascending(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}
