import java.io.*;import java.util.Arrays;
public class comb
{    public static void main(String args[])
{        long starttime = System.nanoTime();
    for (int i= 0 ; i < 1000000; i++){
    }



    comb ob = new comb();        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
    System.out.println(" bylo " + Arrays.toString(arr));        ob.sort(arr);

    System.out.println("stalo");
    for (int i=0; i<arr.length; ++i)
    System.out.print(arr[i] + " ");



    long end = System.nanoTime();
    long duration = (end - starttime);        System.out.println("                 ");
    System.out.println("===========================");        System.out.println(duration + " nanotime");
}
    int getNextGap(int gap)
    {
        gap = (gap*10)/13;
        if (gap < 1)            return 1;
        return gap;    }

    void sort(int arr[])    {
        int counter = 0;
        int n = arr.length;
        int gap = n;

        boolean swapped = true;
        while (gap != 1 || swapped == true)
        {
            gap = getNextGap(gap);
            swapped = false;

            for (int i=0; i<n-gap; i++)            {
                counter++;                if (arr[i] > arr[i+gap])
                {                    System.out.println(Arrays.toString(arr));
                    int temp = arr[i];
                    arr[i] = arr[i+gap];                    arr[i+gap] = temp;

                    swapped = true;                    System.out.println(Arrays.toString(arr));
                }            }
            System.out.println(counter);        }
    }


}