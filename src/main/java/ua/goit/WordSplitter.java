package ua.goit;

import java.util.Arrays;

/**
 * Task 5
 **/

public class WordSplitter {
    public String[] split(String phrase) {
        String[] wordsArray = phrase.toLowerCase().split("\\s+");
        return wordsArray;
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
