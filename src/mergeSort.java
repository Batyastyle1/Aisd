import java.util.Arrays;
class MergeSort {    public static void main(String args[])
{
    long starttime = System.nanoTime();        for (int i= 0 ; i < 1000000; i++){
}
    int arr[] = { 12, 11, 13, 5, 6, 7 };
    System.out.println("bylo");
    printArray(arr);        System.out.println(" counter = " + arr.length);
    MergeSort ob = new MergeSort();        ob.sort(arr, 0, arr.length - 1);
    System.out.println("\nstalo");
    printArray(arr);        long end = System.nanoTime();
    long duration = (end - starttime);        System.out.println("                 ");
    System.out.println("===========================");        System.out.println(duration + " nanotime");
}
    void merge(int arr[], int l, int m, int r)
    {        int counter = 0;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        System.out.println(Arrays.toString(arr));        for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;
        int k = l;
        int   count1=0;
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {                arr[k] = L[i];
                i++;            }
            else {                arr[k] = R[j];
                j++;            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];            i++;
            k++;        }

        while (j < n2) {            arr[k] = R[j];
            j++;            k++;
        }
    }

    void sort(int arr[], int l, int r)    {
        if (l < r) {

            int m = l + (r - l) / 2;
            sort(arr, l, m);            sort(arr, m + 1, r);

            merge(arr, l, m, r);        }

    }
    static void printArray(int arr[])
    {        int n = arr.length;
        for (int i = 0; i < n; ++i)            System.out.print(arr[i] + " ");
        System.out.println();    }

}