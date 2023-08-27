package ua.goit;

/**
 * Task 11
 **/

public class PalindromeCounter {
    public int count(String phrase) {
        String phraseWithoutSymbols = phrase.replaceAll("!|,|\\?|\\.", "");
        String[] phraseWords = phraseWithoutSymbols.toLowerCase().split("\\s+");
        int counter = 0;
        for (int i = 0; i < phraseWords.length; i++) {
            StringBuilder reverse = new StringBuilder(phraseWords[i]).reverse();
            if (reverse.toString().equals(phraseWords[i])) {
                counter++;
            }
        }
        return counter;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level, . ? done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
