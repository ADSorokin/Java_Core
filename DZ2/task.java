package Java_core;
import java.util.Arrays;

public class ArrayOperations {
    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int maxMinDifference(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min || min == 0) {
                min = array[i];
            }
        }
        return max - min;
    }

    public static boolean hasAdjacentZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        System.out.println("Количество чётных элементов: " + countEvens(array1));

        int[] array2 = {2, 2, 0};
        System.out.println("Количество чётных элементов: " + countEvens(array2));

        int[] array3 = {1, 3, 5};
        System.out.println("Количество чётных элементов: " + countEvens(array3));

        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println("Разница между самым большим и самым маленьким элементами: " + maxMinDifference(array4));

        int[] array5 = {0, 1, 2, 3, 4};
        System.out.println("Есть ли два соседних нуля: " + hasAdjacentZeros(array5));
    }
}