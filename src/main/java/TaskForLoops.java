

public class TaskForLoops {

    public static void main(String[] args) {
        //firstTask();
        //secondTask();
        //thirdTask();
        //fourthTask();
        fifthTask();
    }

    public static void firstTask() {
        int coreNumber = 35;
        int divider = 15;
        System.out.println("Wrapped multiply digits : ");
        for (int i = coreNumber * 10; i < 10000; i++) {
            if (i % divider == 0 && ((i - i / 1000 * 1000) / 10) == coreNumber) {
                System.out.println(i);
            }
        }
    }

    public static void secondTask() {
        int n = 0;
        int rightNumber = 874;
        System.out.println(92 + "abc" + " = " + rightNumber + "*x");
        System.out.print("x is : ");
        for (int i = 92000; i < 92999; i++) {
            if(i%rightNumber==0) {
                n = i / rightNumber;
                System.out.println("[" + n + "]");
            }
            }

        }

    public static void thirdTask() {
        int limit = 200;
        int divider = 49;
        for (int a = 0; a < limit; a++) {
            for (int b = 0; b < limit; b++) {
                if ((a * a + b * b) % divider == 0) {
                    System.out.println("a=" + a + " b=" + b);
                }
            }
        }
    }

    public static void fourthTask() {
        int max = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int sumOfCubes = i * 100 + j * 10 + k - (i * i * i + j * j * j + k * k * k);
                    if (sumOfCubes > max) {
                        max = sumOfCubes;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void fifthTask() {
        int count = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    if (a != c) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}