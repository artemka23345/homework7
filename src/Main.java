import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        char[] arrayChar = new char[]{'a', 'b', 'c'};

        task2(array, arrayDouble, arrayChar);
        task3(array, arrayDouble, arrayChar);
        task4(array);

    }

    public static void task2(int[] array, double[] arrayDouble, char[] arrayChar) {
        for (int a : array) {
            if (a == array.length) {
                System.out.println(a);
            } else {
                System.out.print(a + ",");
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ",");
        }
        for (int i = 0; i < arrayChar.length; i++) {
            if (i == arrayChar.length - 1) {
                System.out.println(arrayChar[i]);
                break;
            }
            System.out.print(arrayChar[i] + ",");
        }
    }

    public static void task3(int[] array, double[] arrayDouble, char[] arrayChar) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            } else {
                System.out.print(array[i] + ",");
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ",");
        }
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayChar[i]);
                break;
            }
            System.out.print(arrayChar[i] + ",");
        }

    }

    public static void task4(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}






