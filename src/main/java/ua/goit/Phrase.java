package ua.goit;

import java.util.Arrays;

/**
 * Task
 **/

public class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words,words.length);
    }
    @Override
    public final String toString() {
        String words = "";
        for (String word: this.words) {
            words += word + " ";
        }
        return words;
    }
}

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
