public class TrickyFunctionTest {
   

    public static void main(String[] args) {

        int x = 0 ;
        for (int i =100; i < 1000; i++) {
            if (i%3==0 && i % 5 != 0 && !containsDigit(i, 2)){
                x += i;
            }
            
        }
        System.out.println(x);





    }
    private static boolean containsDigit(int num , int x ){
        while (num != 0) {
            int currentDigit = num % 10;
            if (currentDigit == x) {
                return true;
            }
            num /= 10;
        }
        return false;

    }



}