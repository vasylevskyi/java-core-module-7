package ua.goit;

/**
 * Task 21
 **/

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        char[] sourceWordLetters = sourceWord.toLowerCase().toCharArray();
        char[] targetWordLetters = targetWord.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < targetWord.length(); i++) {
            for (int j = 0; j < sourceWord.length(); j++) {
                if (targetWordLetters[i] == sourceWordLetters[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                return false;
            }
        }
        if (counter < targetWord.length()) {
            return false;
        }
        return true;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
