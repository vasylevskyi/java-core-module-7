package ua.goit;

/**
 * Task 10
 **/

public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] phraseWords = phrase.split("\\s+");
        int counter = 0;
        for (String word: phraseWords) {
            if (word.length() <= minLength) {
                counter++;
            }
        }
        return counter;
    }
}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
