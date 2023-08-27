package ua.goit;

/**
 * Task 13
 **/

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] wordsFromPhrase = phrase.split("\\s+");
        StringBuilder phraseResult = new StringBuilder();
        for (int i = 0; i < wordsFromPhrase.length; i++) {
            int counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (!wordsFromPhrase[i].equals(words[j])) {
                    counter++;
                    continue;
                }
            }
            if (counter == words.length) {
                phraseResult.append(wordsFromPhrase[i] + " ");
            }

        }
        return phraseResult.toString().strip();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
