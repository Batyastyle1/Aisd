import java.util.*;


public class rr {

    public static void main(String[] args) {
//        int[] i;
//        i = new int[12];
//        for (int x = 0; x < i.length; x++) {
//            i[x] = ((int)(Math.random() * 12) + 115);
//            System.out.println(i[x]);
//        }

        int[] i= {1,2,43,578,8,69,5434,768,364,23,23,4};

        System.out.println("bylo = " + Arrays.toString(i));
        new rr(i);


    }

    public rr(int[] i) {
        int counter = 0;
        System.out.println("sort " + i.length + " elements");
        while(!isSorted(i)) {
            peremeshka(i);
            counter++;
        }
        System.out.println("counter " + counter   );
        sout(i);

    }

    private void sout(int[] i) {
        for(int x : i) {
            System.out.print(x + ", ");
        }
        System.out.println();

    }

    private void peremeshka(int[] i) {
        for(int x = 0; x < i.length; ++x) {
            int index1 = (int) (Math.random() * i.length),
                    index2 = (int) (Math.random() * i.length);
            int a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;

        }
    }

    private boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;

            }
        }
        return true;
    }


}