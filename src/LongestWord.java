public class LongestWord {
    public static void main(String[] args) {
        String[] wordList = {"apple", "banana", "cherry", "date", "elderberry", "fig"};

        String lognWord = getLongestWord(wordList);
        System.out.println(lognWord);

    }

    private static String getLongestWord(String[] wordList){
        String longWord = "";
         for (String word : wordList){
             if (word.length() > longWord.length()){
                 longWord = word;
             }
         }
       return longWord;

    }
}
