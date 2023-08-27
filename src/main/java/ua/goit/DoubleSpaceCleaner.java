package ua.goit;

/**
 * Task 7
 **/

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String phraseWithoutSpaces = phrase.strip().replaceAll("\\s+", " ");
        return phraseWithoutSpaces;
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
