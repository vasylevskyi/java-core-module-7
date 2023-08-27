package ua.goit;

/**
 * Task 14
 **/

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveWords = {"pass", "key", "login", "email"};
        String[] wordsFromPhrase = phrase.toLowerCase().replaceAll(":|,|\\.|!|\\?", "").split("\\s+");
        for (int i = 0; i < wordsFromPhrase.length; i++) {
            for (int j = 0; j < sensitiveWords.length; j++) {
                if (wordsFromPhrase[i].equals(sensitiveWords[j])) {
                return true;
                }
            }
        }
        return false;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
