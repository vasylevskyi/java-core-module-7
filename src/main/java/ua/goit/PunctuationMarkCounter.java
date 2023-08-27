package ua.goit;

/**
 * Task 6
 **/

public class PunctuationMarkCounter {
    public int count(String phrase) {
        char[] phraseChars = phrase.toCharArray();
        int counter = 0;
        for (char i: phraseChars) {
            if (i == '.' || i == ',' || i == '!' || i == ':' || i == ';') {
                counter++;
            }
        }
        return counter;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
