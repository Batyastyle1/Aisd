import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {


        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int k = array[i];
                array[i] = array[j];
                array[j] = k;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            // your code here
        }


        int[] x = {2, 1, 3, 4, 56, 7, 8, 54, -5, 566, -3, 0, -67, -44, 4567, 21, 3, 42, 543, 65, 789, 467, 5865};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // время выполнения в наносекундах

        System.out.println("Duration: " + duration + " ns");


    }
}