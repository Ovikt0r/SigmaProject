import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Handler {


    static final List<Integer> positiveNumbers = new ArrayList<>();
    static final List<Integer> negativeNumbers = new ArrayList<>();
    static final List<Integer> rangeAverageNumbers = new ArrayList<>();

    public static void main(String[] args) {
        final int[] array1 = new int[]{2, -189, 4, -6, 12, 98, -65, 66, 34, -189, 86, 98, -3, 54, 56, 98, 44, -32, 23, 45, 98, 43, -42, -189, 22, 11, -189};
        final int[] array2 = new int[]{-10, 300, 780, 250, -990, 40, -60, 780, -300, 660, 580, -150, 7, -100, 450, 220, -30, -174, 88, 100, 140, 40, -990};
        makeTwoCollections(array1);
        System.out.println(positiveNumbers);
        System.out.println(negativeNumbers);
        System.out.println(calculateArithmeticAverage(array1));
        System.out.println(calculateArithmeticAverage(array2));
        System.out.println(createSpecialCollection(array1, array2));
        System.out.println(findMaxValue(array1));
        System.out.println(findMinValue(array1));
        System.out.println(Arrays.toString(eliminateDuplicateMaxAndMin(array1)));
        System.out.println(Arrays.toString(eliminateFirstDuplicateMaxAndMin(array1)));
        System.out.println(findMaxValue(array2));
        System.out.println(findMinValue(array2));
        System.out.println(Arrays.toString(eliminateDuplicateMaxAndMin(array2)));
        System.out.println(Arrays.toString(eliminateFirstDuplicateMaxAndMin(array2)));

    }


    public static void makeTwoCollections(int[] array) {
        for (int element : array) {
            if (element > -1) {
                positiveNumbers.add(element);
            } else {
                negativeNumbers.add(element);
            }
        }
    }

    public static List<Integer> createSpecialCollection(int[] array1, int[] array2) {
        double average1 = calculateArithmeticAverage(array1);
        double average2 = calculateArithmeticAverage(array2);
        List<Integer> integerList = new ArrayList<>();
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        //Arrays.sort(mergeArray);
        for (Integer element : mergeArray) {
            if (element < average1 && element > average2 || element > average1 && element < average2) {
                integerList.add(element);
            }
        }
        return integerList;
    }

    public static int[] eliminateDuplicateMaxAndMin(int[] array) {
        int max = findMaxValue(array);
        int min = findMinValue(array);
        int counter = 0;
        for (int element : array) {
            if (element == max || element == min) {
                counter++;
            }
        }
        int[] withoutDuplicateArray = new int[array.length - counter + 2];
        int index = 0;
        boolean flagMax = true;
        boolean flagMin = true;
        for (int element : array) {
            if (flagMax && element == max) {
                withoutDuplicateArray[index++] = element;
                flagMax = false;
            }
            if (flagMin && element == min) {
                withoutDuplicateArray[index++] = element;
                flagMin = false;
            }
            if (element != max && element != min) {
                withoutDuplicateArray[index++] = element;
            }
        }
        return withoutDuplicateArray;
    }

    public static int[] eliminateFirstDuplicateMaxAndMin(int[] array) {
        int max = findMaxValue(array);
        int min = findMinValue(array);
        int maxCounter = calculateHowManyMaximumElements(array);
        int minCounter = calculateHowManyMinimumElements(array);
        int counter = maxCounter + minCounter;
        int[] withoutDuplicateArray = new int[array.length - counter + 2];
        int resultIndex = 0;
        for (int element : array) {
            if (element != max && element != min) {
                withoutDuplicateArray[resultIndex++] = element;
            }
            if (maxCounter > 0 && element == max) {
                maxCounter--;
            }
            if (minCounter > 0 && element == min) {
                minCounter--;
            }
            if (maxCounter == -1 && element == max) {
                withoutDuplicateArray[resultIndex++] = element;
            }
            if (minCounter == -1 && element == min) {
                withoutDuplicateArray[resultIndex++] = element;
            }

        }
        return withoutDuplicateArray;
    }

    public static double calculateArithmeticAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }


    public static int findMaxValue(int[] array) {
        int maximum = -1;
        for (int element : array) {
            if (element > maximum) {
                maximum = element;
            }
        }
        return maximum;
    }

    public static int findMinValue(int[] array) {
        int minimum = 0;
        for (int element : array) {
            if (element < minimum) {
                minimum = element;
            }
        }
        return minimum;
    }

    public static int calculateHowManyMaximumElements(int[] array) {
        int max = findMaxValue(array);
        int counter = 0;
        for (int element : array) {
            if (element == max) {
                counter++;
            }
        }
        return counter;
    }

    public static int calculateHowManyMinimumElements(int[] array) {
        int min = findMinValue(array);
        int counter = 0;
        for (int element : array) {
            if (element == min) {
                counter++;
            }
        }
        return counter;
    }
}
