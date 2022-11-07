

import java.util.Arrays;

public class ArraysTask {
    static final int[] array1 = new int[]{2, 4, -6, 12, -65, 66, 34, 86, -3, 54, 56, 44, -32, 23, 45, 98, 43, -42, 22, 11, -189};

    public static void main(String[] args) {
        printSumAndAmountEvenElements();
        printMinNegativeAndMinPositiveElements();
        System.out.println("The original array: \n" + Arrays.toString(array1));
        System.out.println("A new array with positive elements increased by one " +
                "and negative elements decreased by one : \n" + Arrays.toString(increasePositiveAndDecreaseNegativeByOne()));
        System.out.println("Maximum positive number is " + findMaxValue());
        System.out.println("Maximum negative number is " + findMinValue());
        System.out.println("A new array with changed maximum and minimum : \n" + Arrays.toString(changeMaxAndMin()));
        System.out.println("The array with deleted max and min values : \n" + Arrays.toString(deleteMaxAndMin()));
        System.out.println("The arithmetic mean of the array is " + calculateArithmeticAverage());
        System.out.println("The sum of the elements that are greater than the arithmetic mean of the array is " + findAmountOfElementsMoreThanAverage());

    }

    public static void printSumAndAmountEvenElements() {
        int amount = 0;
        int sum = 0;
        for (int j : array1) {
            if (j % 2 == 0) {
                sum += j;
                amount++;
            }
        }
        System.out.println("Amount of even elements : " + amount);
        System.out.println("Sum of pair elements : " + sum);
    }

    public static void printMinNegativeAndMinPositiveElements() {
        int edgeMinNegativeNumber = -2147483648;
        int edgeMinPositiveNumber = 2147483647;
        for (int j : array1) {
            if (j < 0 && j > edgeMinNegativeNumber) {
                edgeMinNegativeNumber = j;
            }
            if (j > 0 && j < edgeMinPositiveNumber) {
                edgeMinPositiveNumber = j;
            }
        }
        System.out.println("Minimal negative number is " + edgeMinNegativeNumber);
        System.out.println("Minimal positive number is " + edgeMinPositiveNumber);
    }

    public static int[] increasePositiveAndDecreaseNegativeByOne() {
        int[] copyArray = Arrays.copyOf(array1, array1.length);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                copyArray[i] += 1;
            }
            if (array1[i] < 0) {
                copyArray[i] -= 1;
            }
        }
        return copyArray;
    }

    public static int findMaxValue() {
        int tempForMaximum = 0;
        for (int j : array1) {
            if (j > tempForMaximum) {
                tempForMaximum = j;
            }
        }
        return tempForMaximum;
    }

    public static int findMinValue() {
        int tempForMinimum = -1;
        for (int j : array1) {
            if (j < tempForMinimum) {
                tempForMinimum = j;
            }
        }
        return tempForMinimum;
    }

    public static int[] changeMaxAndMin() {
        int[] copyArray = Arrays.copyOf(array1, array1.length);
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] == findMaxValue()) {
                copyArray[j] = findMinValue();
            }
            if (array1[j] == findMinValue()) {
                copyArray[j] = findMaxValue();
            }
        }
        return copyArray;
    }

    public static int[] deleteMaxAndMin() {
        int[] copyArray1 = new int[array1.length - 1];
        int[] copyArray2 = new int[copyArray1.length - 1];
        int tempMaxIndex = 0;
        int tempMinIndex = 0;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] == findMaxValue()) {
                tempMaxIndex = j;
            }
        }
        System.arraycopy(array1, 0, copyArray1, 0, tempMaxIndex);
        System.arraycopy(array1, tempMaxIndex + 1, copyArray1, tempMaxIndex, array1.length - tempMaxIndex - 1);
        for (int i = 0; i < copyArray1.length; i++) {
            if (copyArray1[i] == findMinValue()) {
                tempMinIndex = i;
            }
        }
        System.arraycopy(copyArray1, 0, copyArray2, 0, tempMinIndex);
        System.arraycopy(copyArray1, tempMinIndex, copyArray2, tempMinIndex, copyArray1.length - tempMinIndex - 1);

        return copyArray2;
    }

    public static int calculateArithmeticAverage() {
        int sum = 0;
        for (int j : array1) {
            sum += j;
        }
        return sum / array1.length;
    }

    public static int findAmountOfElementsMoreThanAverage() {
        int sum = 0;
        for (int j : array1) {
            if (j > calculateArithmeticAverage()) {
                sum++;
            }
        }
        return sum;
    }
}