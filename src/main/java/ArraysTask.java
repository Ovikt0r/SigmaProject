import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {

        int[] array1 = new int[]{2, 4, -6, 12, -65, 66, 34, 86, -3, 54, 56, 44, -32, 23, 45, 98, 43, -42, 22, 11, -189};
        int amount = 0;
        int sum = 0;
        int minNegativeNumber = -1;
        int minPositiveNumber = 2147483647;
        int maxPositiveNumber = 0;
        int maxNegativeNumber = -1;
        int[] copyArray1 = Arrays.copyOf(array1, array1.length);
        int[] copyArray2 = Arrays.copyOf(array1, array1.length);
        int[] copyArray3 = Arrays.copyOf(array1, array1.length);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                sum += array1[i];
                amount++;
            }
            if (array1[i] < 0 && array1[i] < minNegativeNumber) {
                minNegativeNumber = array1[i];
            }

            if (array1[i] > 0 && array1[i] < minPositiveNumber) {
                minPositiveNumber = array1[i];
            }
            {
                if (array1[i] > 0) {
                    copyArray1[i] += 1;
                }
                if (array1[i] < 0) {
                    copyArray1[i] -= 1;
                }
            }
            {
                if (array1[i] > maxPositiveNumber) {
                    maxPositiveNumber = array1[i];
                }
                if (array1[i] < maxNegativeNumber) {
                    maxNegativeNumber = array1[i];
                }
            }

        }
        for (int j = 0; j < array1.length; j++) {
            if(array1[j] == maxPositiveNumber) {
                copyArray2[j] = maxNegativeNumber;
            }
            if(array1[j] == maxNegativeNumber) {
                copyArray2[j] = maxPositiveNumber;
            }
        }

        System.out.println("Amount of even elements : " + amount);
        System.out.println("Sum of pair elements : " + sum);
        System.out.println("Minimal negative number is " + minNegativeNumber);
        System.out.println("Minimal positive number is " + minPositiveNumber);
        System.out.println("The original array: \n" + Arrays.toString(array1));
        System.out.println("A new array with positive elements increased by one and negative elements decreased by one : \n" + Arrays.toString(copyArray1));
        System.out.println("Maximum negative number is " + maxPositiveNumber);
        System.out.println("Maximum positive number is " + maxNegativeNumber);
        System.out.println("A new array with changed maximum and minimum : \n" + Arrays.toString(copyArray2));


    }

}