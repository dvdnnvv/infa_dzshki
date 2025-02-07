public class AllTasks {

    // 1. Выяснить, является ли произведение элементов второго столбца массива трёхзначным числом
    public static boolean isProductThreeDigit(int[][] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i][1]; // Элементы второго столбца
        }
        return product >= 100 && product < 1000;
    }

    // 2. Составить программу, определяющую, верно ли, что сумма элементов строки массива с известным номером превышает заданное число?
    public static boolean isRowSumGreaterThan(int[][] arr, int row, int number) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum > number;
    }

    // 3. Выяснить, является ли сумма элементов четвёртой строки массива двузначным числом
    public static boolean isRowSumTwoDigit(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr[3].length; i++) {
            sum += arr[3][i]; // Четвёртая строка (индекс 3)
        }
        return sum >= 10 && sum < 100;
    }

    // 4. Программа, определяющая, верно ли, что произведение элементов столбца массива с известным номером не превышает заданного числа?
    public static boolean isColumnProductLessThan(int[][] arr, int col, int number) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i][col];
        }
        return product <= number;
    }

    // 5. Определить максимальное из двух чисел: суммы элементов k-й строки и суммы элементов s-го столбца массива
    public static int maxOfRowAndColumnSum(int[][] arr, int k, int s) {
        int rowSum = 0;
        for (int i = 0; i < arr[k].length; i++) {
            rowSum += arr[k][i];
        }

        int colSum = 0;
        for (int i = 0; i < arr.length; i++) {
            colSum += arr[i][s];
        }

        return Math.max(rowSum, colSum);
    }

    // 6. a) Есть ли в нем столбец, состоящий только из нулей?
    public static boolean isColumnAllZero(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            boolean allZero = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                return true;
            }
        }
        return false;
    }

    // 7. a) Программа, которая переставляет две любые строки массива
    public static void swapRows(int[][] arr, int row1, int row2) {
        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

    // 7. b) Программа, которая переставляет два любые столбца массива
    public static void swapColumns(int[][] arr, int col1, int col2) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][col1];
            arr[i][col1] = arr[i][col2];
            arr[i][col2] = temp;
        }
    }

    // 8. a) Сформировать одномерный массив, каждый элемент которого равен первому четному элементу соответствующего столбца двумерного массива
    public static int[] firstEvenInColumn(int[][] arr) {
        int[] result = new int[arr[0].length];
        for (int j = 0; j < arr[0].length; j++) {
            result[j] = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] % 2 == 0) {
                    result[j] = arr[i][j];
                    break;
                }
            }
        }
        return result;
    }

    // 8. b) Сформировать одномерный массив, каждый элемент которого равен последнему нечетному элементу соответствующей строки двумерного массива
    public static int[] lastOddInRow(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = 0;
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] % 2 != 0) {
                    result[i] = arr[i][j];
                    break;
                }
            }
        }
        return result;
    }

    // 9. a) Создать третий массив, каждый элемент которого равен сумме соответствующих элементов двух первых массивов
    public static int[][] sumOfTwoArrays(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    // 9. b) Создать третий массив, каждый элемент которого равен 100, если соответствующие элементы двух первых массивов имеют одинаковый знак, и равен нулю в противном случае
    public static int[][] sameSignArray(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if ((arr1[i][j] >= 0 && arr2[i][j] >= 0) || (arr1[i][j] < 0 && arr2[i][j] < 0)) {
                    result[i][j] = 100;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Пример вызова функций
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Произведение второго столбца трёхзначное: " + isProductThreeDigit(arr));
        System.out.println("Сумма строки больше 10: " + isRowSumGreaterThan(arr, 1, 10));
        System.out.println("Сумма строки двузначная: " + isRowSumTwoDigit(arr));
        System.out.println("Произведение столбца меньше 100: " + isColumnProductLessThan(arr, 2, 100));
        System.out.println("Максимум из суммы строки и столбца: " + maxOfRowAndColumnSum(arr, 1, 2));
        System.out.println("Есть ли столбец, состоящий только из нулей: " + isColumnAllZero(arr));

        swapRows(arr, 0, 1);
        System.out.println("После перестановки строк:");
        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        swapColumns(arr, 0, 2);
        System.out.println("После перестановки столбцов:");
        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        int[] firstEvens = firstEvenInColumn(arr);
        System.out.println("Первый чётный элемент в каждом столбце:");
        for (int el : firstEvens) {
            System.out.print(el + " ");
        }
        System.out.println();

        int[] lastOdds = lastOddInRow(arr);
        System.out.println("Последний нечётный элемент в каждой строке:");
        for (int el : lastOdds) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
