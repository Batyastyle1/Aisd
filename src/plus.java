    import java.util.Arrays;

    class MyArrayUtils {

        public static void main(String[] args) {
            int[] numbers = {1, 5, 8, 100};

            System.out.println(Arrays.toString(MyArrayUtils.miniasd(numbers, 2)));



            System.out.println(Arrays.toString(numbers));


            System.out.println(Arrays.toString(MyArrayUtils.miniasd(numbers, 1)));


        }
        public static int[] miniasd(int[] values, int index){
             var result = new int[values.length - 1];


            for (var i = 0; i < values.length; i++) {
                if (i != index) {
                    var newIndex = i < index ? i : i - 1;
                    result[newIndex] = values[i];
                }
            }

            return result;
        }
    }


